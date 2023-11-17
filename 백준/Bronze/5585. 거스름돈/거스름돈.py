import sys

sys.setrecursionlimit(10**6)

n = int(input())
n = 1000 - n
count = 0

while n > 0:
    if n >= 500:
        count += n // 500
        n = n % 500
    elif n >= 100:
        count += n // 100
        n = n % 100
    elif n >= 50:
        count += n // 50
        n = n % 50
    elif n >= 10:
        count += n // 10
        n = n % 10
    elif n>=5:
        count+= n//5
        n =n%5
    else:
        count += n // 1
        n = n % 1

count = round(count)

print(count)
