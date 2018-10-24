# -*- coding: utf-8 -*-
"""
Created on Mon Oct 22 01:44:49 2018

@author: JinJheng
"""

import requests                      #requests：幫我們抓取 csv 檔
from io import StringIO
import pandas as pd                  #pandas：幫我們選股
import numpy as np
datestr = '20181018'
r = requests.post('http://www.twse.com.tw/exchangeReport/MI_INDEX?response=csv&date=' + datestr + '&type=ALL')
df = pd.read_csv(StringIO("\n".join([i.translate({ord(c): None for c in ' '}) 
                                     for i in r.text.split('\n') 
                                     if len(i.split('",')) == 17 and i[0] != '='])), header=0)
print(df)
#df[pd.to_numeric(df['本益比'], errors='coerce') < 15]