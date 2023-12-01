import sys
from collections import deque
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

arr=[]
for i in range(9):
    arr.append(int(input()))

arr.sort()

sum = sum(arr)

result = []

for i in range(9):

    for j in range(i+1,9):
        if len(result)==2:
            break;

        if sum - arr[i] - arr[j] == 100:
            result.append(arr[i])
            result.append(arr[j])
            break;


for element in arr:
    if element not in result:
        print(element)

