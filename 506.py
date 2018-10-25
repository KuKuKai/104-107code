# -*- coding: utf-8 -*-
"""
Created on Thu Oct 25 22:06:59 2018

@author: JinJheng
"""

import math
a=int(input())
b=int(input())
c=int(input())
def compute():
    if b*b-4*a*c>=0:
        x=(-b+math.sqrt(b*b-4*a*c))/(2*a)
        y=(-b-math.sqrt(b*b-4*a*c))/(2*a)
        print(x,end='')
        print(',',y)
    else:
        print('Your equation has no root.')
compute()