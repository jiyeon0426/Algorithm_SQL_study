import sys
from collections import deque
sys.setrecursionlimit(10000)
def dfs(x, y):
    if 0 <= x < n and 0 <= y < m and graph[x][y] == 1:
        graph[x][y] = 0
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            dfs(nx, ny)
        return True
    return False

dx = [-1, -1, -1, 0, 0, 1, 1, 1]  # x
dy = [-1, 0, 1, -1, 1, -1, 0, 1]  # y

result = []

while True:
    m, n = map(int, input().split())
    count = 0

    if n == 0 and m == 0:
        break

    graph = []

    for i in range(n):
        graph.append(list(map(int, input().split())))

    for i in range(n):
        for j in range(m):
            if dfs(i, j):
                count += 1

    result.append(count)  # 섬의 갯수를 결과 리스트에 추가

for count in result:
    print(count)  # 섬의 갯수 출력
