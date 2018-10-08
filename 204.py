# -*- coding: utf-8 -*-
"""
Created on Thu Oct  4 20:15:08 2018

@author: USER
"""

a=eval(input())
b=eval(input())
c=input()
if(c=='*'):
    d=a*b
elif(c=='/'):
    d=a/b
elif(c=='+'):
    d=a+b
elif(c=='-'):
    d=a-b
elif(c=='//'):
    d=a//b
else:
  d=a%b
print(d)
