n = int(input())
data = list(map(int, input().split()))

total=0

data.sort()

for i in range (n):
    for j in range (i+1):
        total += data[j]

print(total)