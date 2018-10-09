# -*- coding: utf-8 -*-
"""
Created on Tue Oct  9 20:58:07 2018

@author: JinJheng
"""

a=int(input())
if a%400==0:
    print(a,"is a leap year.")
elif a%100==0 or a%4!=0:
    print(a,"is not a leap year.")
elif a%4==0:
    print(a,"is a leap year.")
else:
    print()