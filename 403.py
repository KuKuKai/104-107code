a=int(input())
b=int(input())
count=total=0
for i in range(a,b+1):
  if i%4==0 or i%9==0:
    print('{:<4d}'.format(i),end='')
    count += 1
    total += i
    if count%10==0:
      print()
print()
print(count)
