# -*- coding: utf-8 -*-
"""
Created on Fri Oct 26 19:32:49 2018

@author: JinJheng
"""

x,y=map(int,input().split(','))
m,n=map(int,input().split(','))
if n > y:
       greater = n
else:
       greater = y
while(True):
    if((greater % n == 0) and (greater % y == 0)):
        q = greater
        break
    greater += 1
o=q/y*x
r=q/n*m
p=int(o+r)
def compute():
    if p>q:
        small=q
    else:
        small=p
    for i in range(1,small+1):
        if (p%i==0)and(q%i==0):
            ans=i
    print(x,end='')
    print('/',end='')
    print(y,'+',m,end='')
    print('/',end='')
    print(n,'=',int(p/ans),end='')
    print('/',end='')
    print(int(q/ans))
compute()