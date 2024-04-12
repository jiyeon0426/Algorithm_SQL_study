import sys
from collections import deque

input = sys.stdin.readline

def BFS(start):
    q = deque()
    q.append((start,0))
    visited[start] = True

    while q:
        city, dist = q.popleft()

        if dist == k: # 거리가 k이면 결과에 추가하고 탐색 종료
            result.append(city)

        for neighbor in graph[city]:
            if not visited[neighbor]:
                q.append((neighbor, dist + 1))
                visited[neighbor] = True

n, m, k, x = map(int, input().split())

graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)
result = []

for _ in range(m):
    nx, ny = map(int, input().split())
    graph[nx].append(ny)

BFS(x)

if not result:
    print(-1)
else:
    result.sort() # 결과를 정렬하고 출력
    for city in result:
        print(city)
