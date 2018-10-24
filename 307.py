# -*- coding: utf-8 -*-
"""
Created on Wed Oct 24 20:12:14 2018

@author: JinJheng
"""

n=int(input())
for i in range(1,n+1):
    for j in range(1,n+1):
        print(j,'*',i,'=','%-4s' %(i*j),end='')
    print("")