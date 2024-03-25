import copy

import sys
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)


def DFS(start):

    visit[start]= True
    answer.append(start)
    graph[start].sort()

    for i in graph[start]:
        if not visit[i]: # 방문하지 않았다면
            DFS(i)


def BFS(start):
    q = deque()
    q.append(start)
    visit2[start] = True

    while q:
        v = q.popleft()
        answer2.append(v)
        graph[v].sort()

        for neighbor in graph[v]:
            if not visit2[neighbor]:
                visit2[neighbor] = True
                q.append(neighbor)


n, m, start = map(int, input().split())

visit = [False] * (n+1)
visit2 = [False] * (n+1)

graph = [[] for _ in range(n+1)]
answer=[]
answer2= []

for i in range(m):
    x,y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

BFS(start)
DFS(start)

for ans in answer:
    print(ans, end=' ')

print()

for ans2 in answer2:
    print(ans2, end=' ')

#print(answer) # DFS
#print(answer2) # BFS