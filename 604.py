lst=[]
for i in range(10):
  num=input()
  lst.append(num)
max_count=0
for x in lst:
  num_count=lst.count(x)
  if num_count>max_count:
    max_count=num_count
    mode=x
print(mode)
print(max_count)
