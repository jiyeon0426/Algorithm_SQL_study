import copy
import sys
import math
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)


def find_parent(n):
    parent = [0] * (n+1) # 부모 노드를 저장할 리스트
    visit = [False] * (n+1)

    stack = [1]
    visit[1] = True

    while stack:

        num = stack.pop()
        visit[num]=True

        for node in graph[num]:
            if visit[node] != True:
                parent[node] = num
                visit[node] = True
                stack.append(node)
    return parent


parent=[]
n = int(input())
graph = [[]for _ in range(n+1)]

for i in range(n-1):
    x,y = map(int,input().split())

    graph[x].append(y)
    graph[y].append(x)

parent = find_parent(n)
for i in range(2,n+1):
    print(parent[i])