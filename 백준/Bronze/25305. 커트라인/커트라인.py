import sys
from collections import deque

sys.setrecursionlimit(10000)

n , x = map(int, input().split())
arr =[]

arr = list(map(int,input().split()))
arr.sort(reverse=True)

print(arr[x-1])