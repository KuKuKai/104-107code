nami=0
chop=0
other=0
for i in range(5):
  i=int(input())
  if i==1:
     nami+=1
  elif i==2:
     chop+=1
  else:
     other+=1
  print("Total votes of No.1: Nami = ",nami)
  print("Total votes of No.2: Chopper = ",chop)
  print("Total null votes = ",other)
  
if chop<nami:
  print('=> No.1 Nami won the election.')
elif nami<chop:
  print('=> No.2 Chopper won the election.')
else:
  print('=> No one won the election.')
