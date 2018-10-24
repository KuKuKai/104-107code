# -*- coding: utf-8 -*-
"""
Created on Wed Oct 24 18:08:17 2018

@author: JinJheng
"""

n=int(input())
for i in range(1,n+1):
    for j in range(1,i+1):
        print('%4s' %(i*j),end='')
    print("")