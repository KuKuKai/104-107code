# -*- coding: utf-8 -*-
"""
Created on Fri Oct  5 17:54:02 2018

@author: JinJheng
"""

def quicksort (list):
    if len(list)<2:
        return list
    else:
        left=[] #比基準點小
        right=[] #比基準點大
        keylist=[]
        pivot=list.pop() #基準點 #從list中移除
        for i in list:
            if i<pivot:
                left.append(i)
            else:
                right.append(i)
        left=quicksort(left)
        right=quicksort(right)
    return left + [pivot] +right
print("輸入9999即停止")
num=int(input("\n"+"Number="))
list=[]
list.append(num)
while True:
    num=int(input("\n"+"Number="))
    if num==9999:
        print("快速排序前:"+str(list))
        break
    else:
        list.append(num)
print("快速排序後:"+str(quicksort(list)))