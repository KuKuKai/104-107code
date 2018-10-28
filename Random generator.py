# -*- coding: utf-8 -*-
"""
Created on Fri Oct  5 18:50:54 2018

@author: JinJheng
"""

import random
data=[]
i=0
while i<6:
    val=random.randint(1,55)
    flag=1
    for j in range(0,len(data)-1):
        if data.pop(j)==val:
            flag=0
    if flag:
        data.append(val)
        print("{}".format(data.pop(len(data)-1)),end=" ")
        i+=1