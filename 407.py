# -*- coding: utf-8 -*-
"""
Created on Sat Oct 20 14:23:35 2018

@author: JinJheng
"""

while True:
  a=int(input())
  if a==-9999:
    break
  elif a%400==0:
    print(a,"is a leap year.")
  elif a%100==0 or a%4!=0:
    print(a,"is not a leap year.")
  elif a%4==0:
    print(a,"is a leap year.")