# -*- coding: utf-8 -*-
"""
Created on Thu Oct 25 23:26:35 2018

@author: JinJheng
"""

x, y = map(int,input().split(','))
def compute():
    if x>y:
        small=y
    else:
        small=x
    for i in range(1,small+1):
        if (x%i==0)and(y%i==0):
            ans=i
    print(ans)
compute()