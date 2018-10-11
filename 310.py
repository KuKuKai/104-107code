# -*- coding: utf-8 -*-
"""
Created on Thu Oct 11 21:31:20 2018

@author: JinJheng
"""

n=int(input())
ans=0
for i in range(2,n+1):
    ans+=1/((i-1)**0.5+i**0.5)
print('%.4f'%ans)