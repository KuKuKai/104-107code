# -*- coding: utf-8 -*-
"""
Created on Tue Oct 30 20:04:33 2018

@author: JinJheng
"""

import random
a=0
data=random.sample(range(1,10),4)
#print(data)
while a < 4:
    a=0
    b=0
    num=int(input())
    string=str(num)
    if len(string)==4:
        user=[num//1000%10,num//100%10,num//10%10,num//1%10]
        for i in range(4):
            for j in range(i):
                if user[i]==user[j]:
                    print('Do not input same numbers.')
                    break
            if user[i]==data[i]:
                a=a+1
            for j in range(4):
                if data[i]==user[j]:
                    b=b+1
        b=b-a
        print(a,'A',b,'B')
        if a==4:
            print('Congratulations Win!')
        else:
            print('Not yet finished.')
    else:
        print('Do not input over or less than 4 numbers.')