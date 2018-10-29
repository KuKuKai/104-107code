# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

import requests
import datetime
import time
def str_to_num(s, c_type):
    if c_type not in ['float', 'int']:  #將字串s移除逗點與句點後轉為float/int
        return s                        #若非float或int則不處理,直接回傳
    s=s.replace(',', '')
    try:
        if c_type == 'int':
            return int(s)
        else:                           #c_type == 'float':
            return float(s)
    except:                             #轉換失敗則回傳-1
        return -1

def crawl_price(date):
    datestr = date.strftime('%Y%m%d')   #把datetime物件字串轉為YYYYMMDD格式
    resp = requests.get('http://www.twse.com.tw/exchangeReport/MI_INDEX?response=json&date='+datestr+'&type=ALLBUT0999')
    data = resp.json()                  #從證交網站獲取指定日期的所有個股資訊
    if 'data5' not in data:             #當天沒資料
        return None
    types = ['text', 'datetime', 'int', 'int', 'int', 'float', 'float', 'float', 'float', 'float', 'float', 'int', 'float', 'int', 'float']
    #['證劵代號', '日期(新增)', '成交股數', '成交筆數', '成交金額', '開盤價', '最高價', '最低價', '收盤價', '漲跌價差', '最後揭示買價', '最後揭示買量', '最後揭示賣價', '最後揭示賣量', '本益比']
    prices = []
    for item in data['data5']:
        if item[2] == '0':              #忽略成交股數為0的資料列
            continue                    #第2欄(證劵名稱)及第10欄('漲跌(+/-)', 為HTML碼)不需要所以移除
        filtered = item[:1]+item[2:9]+item[10:]
        filtered = filtered[:1]+[date.strftime('%Y-%m-%d')]+filtered[1:]            #插入日期欄位到第2欄
        prices.append([str_to_num(s, types[i]) for i, s in enumerate(filtered)])
    return prices
for row in crawl_price(datetime.datetime(2018, 10, 3)):                         #主程式
    print(row)

def bulk_insert(fname, bulk_data):      #此行以下為資料庫
    conn = pymysql.connect("localhost","testuser","test123","TESTDB" )       #連接資料庫
    c = conn.cursor()                   #使用cursor()方法创建一个游标对象cursor
    c.execute('BEGIN TRANSACTION')      #使用execute()方法执行SQL查询
    data = c.fetchone()                 #使用fetchone()方法获取单条数据
    print ("Database version : %s " % data)
    for d in bulk_data:
        values = ["'" + str(e) + "'" for e in d]
        cmd = 'INSERT OR REPLACE INTO daily_price VALUES({})'.format(','.join(values))
        c.execute(cmd)
    c.execute('COMMIT')
    conn.close()                        #斷開資料庫連接

def update_db(date_from, date_to):
    print('更新資料：{} 到 {}'.format(date_from.strftime('%Y-%m-%d'), date_to.strftime('%Y-%m-%d')))
    current = date_from
    while current <= date_to:
        prices = crawl_price(current)
        if prices:
            bulk_insert(db_name, prices)
            print(current.strftime('%Y-%m-%d'), '... 成功')
        else:
            print(current.strftime('%Y-%m-%d'), '... 失敗 (可能為假日)')
        current += datetime.timedelta(days=1)
        time.sleep(3)                  #放慢爬蟲速度

def get_date_range_from_db(fname):
    conn = pymysql.connect("localhost","testuser","test123","TESTDB" )      #連接資料庫
    c = conn.cursor()
    c.execute('select * from daily_price order by 日期 ASC LIMIT 1;')
    date_from = datetime.datetime.strptime(list(c)[0][1], '%Y-%m-%d')
    c.execute('select * from daily_price order by 日期 DESC LIMIT 1;')
    date_to = datetime.datetime.strptime(list(c)[0][1], '%Y-%m-%d')
    conn.close()
    return date_from, date_to

db_from, db_to = get_date_range_from_db(db_name)
print('資料庫日期：{} 到 {}'.format(db_from.strftime('%Y-%m-%d'), db_to.strftime('%Y-%m-%d')))
date_from = db_to + datetime.timedelta(days=1)
date_to = datetime.datetime.today()
update_db(date_from, date_to)
