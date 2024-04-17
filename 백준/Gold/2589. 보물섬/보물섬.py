import sys
from collections import deque

input = sys.stdin.readline

def BFS(x,y):
    global max_distance
    q = deque()
    q.append((x,y,0))

    while q:
        x1, y1, dist = q.popleft()
        max_distance = max(max_distance, dist)

        for i in range(4):
            nx = x1 + dx[i]
            ny = y1 + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m or visited[nx][ny] or graph[nx][ny] == "W":
                continue

            visited[nx][ny] = True
            q.append((nx, ny, dist+1))


def newGraph(x, y):
    visited = [[False] * m for _ in range(n)]
    visited[x][y] = True
    return visited


dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

n, m = map(int, input().split())  # n행 m열
graph = []

for _ in range(n):
    graph.append(list(input().rstrip()))

max_distance = 0  # 최단거리가 가장 긴 거리

for i in range(n):
    for j in range(m):
        if graph[i][j] == "L":  # 육지일 경우
            visited = newGraph(i, j)
            BFS(i, j)

print(max_distance)
