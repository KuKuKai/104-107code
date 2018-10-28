# -*- coding: utf-8 -*-
"""
Created on Fri Oct  5 18:44:44 2018

@author: JinJheng
"""

import random
var = [random.randint(1,55)]
x=1
while x<6:
    var.append(random.randint(1,55))
    for y in range(len(var)-1):
        if var[y]==var[len(var)-1]:
            del  var[len(var)-1]
            x-=1
    x+=1
for x in var:
    print(x,end=" ")