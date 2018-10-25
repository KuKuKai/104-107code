# -*- coding: utf-8 -*-
"""
Created on Fri Oct 26 00:15:18 2018

@author: JinJheng
"""

x, y = map(int,input().split(','))
def compute(x,y):
    return x if y == 0 else compute(y,x%y)
print(compute(x,y))