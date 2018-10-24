# -*- coding: utf-8 -*-
"""
Created on Wed Oct 24 20:43:07 2018

@author: JinJheng
"""

n=int(input())
m=eval(input())
o=int(input())
print('%s \t  %s'%('Month','Amount'))
for i in range(1,o+1):
    n=n+n*m/1200
    print('%3d \t %.2f'%(i,n))