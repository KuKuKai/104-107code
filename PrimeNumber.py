# -*- coding: utf-8 -*-
"""
Created on Sun Oct  7 17:20:48 2018

@author: JinJheng
"""

n=eval(input())
for m in range(2,n+1):
    for x in range(2,m):
        if m%x==0:
            print(m,"不是質數",m,'等於',x,'*',m/x)
            break
    else:
        print(m,'是質數')