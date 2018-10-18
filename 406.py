while True:
  a=eval(input())
  if a==-9999:
    break
  b=eval(input())
  c=b/((a/100)**2)
  print('BMI: %.2f'%c)
  if c<18.5:
    print('State: under weight')
  elif 18.5<=c<=25:
    print("State: normal")
  elif 25.0<=c<=30:
