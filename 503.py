# -*- coding: utf-8 -*-
"""
Created on Thu Oct 25 20:33:16 2018

@author: JinJheng
"""

def compute():
    sum=0
    a=int(input())
    b=int(input())
    for i in range(a,b+1):
        sum=sum+i
        i+=1
    print(sum)
compute()