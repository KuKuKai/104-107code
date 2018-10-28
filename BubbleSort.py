# -*- coding: utf-8 -*-
"""
Created on Fri Oct  5 18:23:16 2018

@author: JinJheng
"""

def bubblesort (list):
    if len(list)<2:
        return list
    else:
        for i in range(0,len(list)-1):  #執行次數
            for j in range(0,len(list)-i-1):  #從上一次另一個數開始
                if list[j]>list[j+1]:
                    list[j],list[j+1]=list[j+1],list[j]
    return list
print("輸入9999即停止")
num=int(input("\n"+"Number="))
list=[]
list.append(num)
while True:
    num=int(input("\n"+"Number="))
    if num==9999:
        print("氣泡排序前:"+str(list))
        break
    else:
        list.append(num)
print("氣泡排序後:"+str(bubblesort(list)))