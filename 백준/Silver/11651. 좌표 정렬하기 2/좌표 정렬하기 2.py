import sys
from collections import deque
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n = int(input())

arr = [ [] for _ in range(n) ]

for i in range(n):
    x, y = map(int,input().split())
    arr[i] =x,y

arr = sorted(arr,key=lambda x: (x[1],x[0]))


for element in arr:
    print(element[0], element[1])