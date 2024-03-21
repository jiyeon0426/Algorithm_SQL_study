import sys
sys.setrecursionlimit(10**6)

n = int(input())

m=1
cnt=0
a=0
b=0

while n > 0:
    n -= m
    m +=1 # 줄 수
    cnt +=1

n = n+cnt  # n번째 수

if (cnt % 2 ==0): # 짝수 줄
    a = 1 + (n -1)
    b = cnt - (n-1)
    print(str(a) + "/" + str(b))
else: # 홀수 줄
    a = cnt - (n-1)
    b = 1 + (n -1)
    print(str(a) + "/" + str(b))