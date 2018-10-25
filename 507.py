# -*- coding: utf-8 -*-
"""
Created on Thu Oct 25 22:37:47 2018

@author: JinJheng
"""

def compute():
    x=int(input())
    if x<=1:
        print('Not Prime')
    else:
        for i in range(2,x+1):
            if x%i==0:
                print('Not Prime')
            else:
                print('Prime')
            break
compute()