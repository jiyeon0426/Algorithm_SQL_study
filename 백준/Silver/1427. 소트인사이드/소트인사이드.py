import sys
from collections import deque
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n = int(input())

arr = []

while n>0:
    result = n %10
    arr.append(result)
    n = n//10

arr.sort(reverse=True)

for element in arr:
    print(element, end="")