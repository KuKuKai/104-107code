a=int(input())
if a == 0:
  print('0')
else:
  while a !=0:
    print(a%10,end='')
    a//=10
