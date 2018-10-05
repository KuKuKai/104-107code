# -*- coding: utf-8 -*-
"""
Created on Fri Oct  5 15:42:17 2018

@author: JinJheng
"""

a=input()
if a.isalpha():
    print(a+" is an alphabet.")
elif a.isnumeric():
    print(a+" is a number.")
else:
    print(a+" is a symbol.")