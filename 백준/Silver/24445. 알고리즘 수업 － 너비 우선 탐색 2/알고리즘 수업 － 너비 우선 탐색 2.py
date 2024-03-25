import copy

import sys
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def BFS(start, visit):

    global count
    count = 1

    queue = deque()
    queue.append(start)
    visit[start] = 1

    while queue:
        num = queue.popleft()

        graph[num].sort(reverse=True)

        for neighbor in graph[num]:
            if visit[neighbor] == 0:
                count +=1
                visit[neighbor]=count
                queue.append(neighbor)


answer=0

n,m,start = map(int, input().split())


graph=[[] for _ in range (n+1)]
visit = [0] * (n+1)

for i in range(m):
    x,y = map(int, input().split())

    graph[x].append(y)
    graph[y].append(x)

BFS(start,visit)

for i in range(1, n+1):
    print(visit[i])