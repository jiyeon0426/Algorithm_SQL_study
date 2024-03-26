import copy
import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def DFS(x, y):
    graph[x][y] = 9

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx < 0 or nx >= n or ny < 0 or ny >= m or graph[nx][ny] == 9 or graph[nx][ny] == 0:
            continue

        DFS(nx, ny)

def makeArea(cabbage):
    for i in range(cabbage):
        y, x = map(int, input().split())  # 열, 행
        graph[x][y] = 1

def countWorm():
    worm = 0
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 1:
                DFS(i, j)
                worm += 1
    return worm

tc = int(input())
answer = []

dx = [-1, 1, 0, 0]
dy = [0, 0, 1, -1]

for _ in range(tc):
    m, n, cabbage = map(int, input().split())  # 가로, 세로, 양배추
    graph = [[0] * m for _ in range(n)]  # 그래프 초기화
    makeArea(cabbage)
    answer.append(countWorm())

for ans in answer:
    print(ans)
