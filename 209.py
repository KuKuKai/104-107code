# -*- coding: utf-8 -*-
"""
Created on Tue Oct  9 21:30:47 2018

@author: JinJheng
"""

import math
x=eval(input())
y=eval(input())
z=math.sqrt((x-5)**2+(y-6)**2)
if z<=15:
    print("Inside")
else:
    print("Outside")