# -*- coding: utf-8 -*-
"""
Created on Sun Oct 28 23:17:12 2018

@author: JinJheng
"""

num = int(input())
def compute():
    fib=[0,1]
    if num!=1 and num!=0:
        for i in range(num):
            fib.append(fib[-1]+fib[-2])
            print(fib[i],'',end='')
compute()