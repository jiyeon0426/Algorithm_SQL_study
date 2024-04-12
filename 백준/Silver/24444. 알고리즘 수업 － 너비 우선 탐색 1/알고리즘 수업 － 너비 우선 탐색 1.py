import sys
from collections import deque

input = sys.stdin.readline

def BFS(start):
    q = deque()
    q.append((start,0))
    visited[start] = 1
    count=1

    while q:
        city, dist = q.popleft()
        graph[city].sort()

        for neighbor in graph[city]:
            if not visited[neighbor]:
                q.append((neighbor, dist + 1))
                count+=1
                visited[neighbor] = count

n, m, k = map(int, input().split())

graph = [[] for _ in range(n+1)]
visited = [0] * (n+1)
result = []

for _ in range(m):
    nx, ny = map(int, input().split())
    graph[nx].append(ny)
    graph[ny].append(nx)

BFS(k)

for i in visited[1:]:
    print(i)