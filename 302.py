# -*- coding: utf-8 -*-
"""
Created on Fri Oct  5 23:40:47 2018

@author: JinJheng
"""

a=int(input())
b=int(input())
sum=0
for i in range(a,b+1):
    if i%2==0:
        sum+=i
print(sum)