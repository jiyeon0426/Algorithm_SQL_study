n = list(map(int, input().split()))
data = []
total=0
cnt =0;
for i in range (n[0]):
    data.append(int(input()))


for j in range (n[0]-1,-1,-1):
    if (n[1]%data[j] != n[1]):
        cnt = int(n[1]/data[j])
        n[1] = n[1]%data[j]
        total += cnt

print(total)