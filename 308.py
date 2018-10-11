# -*- coding: utf-8 -*-
"""
Created on Thu Oct 11 21:09:51 2018

@author: JinJheng
"""

a=int(input())
for i in range(a):
    n=int(input())
    m=n
    ans=0
    while m !=0:
        ans+=m%10
        m//=10
    print("Sum of all digits of",n,"is",ans)