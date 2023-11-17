import sys

sys.setrecursionlimit(10**6)

n = int(input())
count = [0] *3
a,b,c = 300, 60,10 # 5분 1분 10초

while n > 0:
    if n >= a:
            count[0]= n//a
            n = n % a
    elif n >= b:
        count[1]=n//b
        n= n %b
    elif n>=c:
        count[2]=n//c
        n=n%c
    else:
        count = -1
        break

if type(count)==list:
    for i in range(3):
        print(count[i], end=" ")
else:
    print(count)