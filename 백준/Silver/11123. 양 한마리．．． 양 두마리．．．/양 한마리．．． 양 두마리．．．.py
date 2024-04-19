import sys
from collections import deque

input = sys.stdin.readline

def DFS(a, b):
    graph[a][b] = "."

    for i in range(4):
        nx = a + dx[i]
        ny = b + dy[i]

        if nx<0 or nx>=x or ny<0 or ny>=y or graph[nx][ny]==".":
            continue

        DFS(nx, ny)

def BFS(a,b):

    q = deque()
    q.append((a,b))
    graph[a][b]="."

    while q:
        x1,y1 = q.popleft()

        for i in range(4):
            nx = x1 + dx[i]
            ny = y1 + dy[i]

            if nx<0 or nx>=x or ny<0 or ny>=y or graph[nx][ny]==".":
                continue

            q.append((nx,ny))
            graph[nx][ny]="."



n = int(input())

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

answer = []

for _ in range(n):
    x, y = map(int, input().split())
    graph = []

    for _ in range(x):
        graph.append(list(input().rstrip()))

    count = 0

    for i in range(x):
        for j in range(y):
            if graph[i][j] == "#": #양이면
                BFS(i, j)
                count += 1

    answer.append(count)

for ans in answer:
    print(ans)
