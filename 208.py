# -*- coding: utf-8 -*-
"""
Created on Fri Oct  5 02:31:49 2018

@author: JinJheng
"""

num=int(input("輸入一0~15之整數\n"))
if num<10:
    print(num)
elif num%10==0:
    print("A")
elif num%10==1:
    print("B")
elif num%10==2:
    print("C")
elif num%10==3:
    print("D")
elif num%10==4:
    print("E")
elif num%10==5:
    print("F")
else:
    print()