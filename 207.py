# -*- coding: utf-8 -*-
"""
Created on Tue Oct  9 21:06:28 2018

@author: JinJheng
"""

a=eval(input())
if 8000<=a<18000:
    b=a*0.95
elif 18000<=a<28000:
    b=a*0.9
elif 28000<=a<38000:
    b=a*0.8
elif 38000<=a:
    b=a*0.7
print(b)