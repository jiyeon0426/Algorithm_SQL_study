import sys
from collections import deque

input = sys.stdin.readline

def BFS():
    time=10001
    q = deque()
    q.append((0, 0, 1))  # x, y, 거리
    graph[0][0] = 1

    while q:
        x, y, dist = q.popleft()

        if graph[x][y] == 2:  # 검을 찾았을 경우
            time = abs(n - 1 - x) + abs(m - 1 - y) + dist -1 # 검을 찾은 위치부터 공주까지의 거리

        if x == n - 1 and y == m - 1:
            return min(dist-1, time)

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0<= nx <n and 0<=ny<m and graph[nx][ny]!=1:
                if visited[nx][ny]==0:
                    visited[nx][ny] = dist
                    q.append((nx, ny, dist + 1))

    return time

n, m, t = map(int, input().split())
graph = []

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

for _ in range(n):
    graph.append(list(map(int, input().split())))


visited=[[0]*m for _ in range(n)]
answer = BFS()


if 0<answer <= t:
    print(answer)
else:
    print("Fail")

