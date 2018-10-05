# -*- coding: utf-8 -*-
"""
Created on Fri Oct  5 03:43:35 2018

@author: JinJheng
"""

a=eval(input())
b=eval(input())
c=eval(input())
if a+b<=c or a+c<=b or b+c<=a:
    print("Invalid")
else:
    print(a+b+c)