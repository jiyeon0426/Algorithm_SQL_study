import sys
from collections import deque
sys.setrecursionlimit(10000)

def dfs(graph, x,y):

    global area
    graph[x][y]= 0

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx<0 or nx>=n or ny<0 or ny>=n:
            continue

        if graph[nx][ny]==1:
            area+=1
            dfs(graph,nx,ny)


n = int(input())

graph=[ ]
count =0
area = 0
area_group = []

dx= [-1, 1, 0, 0] # 상, 하, 좌, 우
dy= [0, 0, -1, 1]

for i in range(n):
    graph.append(list(map(int, input())))

for i in range(n):
    for j in range(n):
        if graph[i][j]==1: # 1일 경우
            area=1
            dfs(graph, i, j)
            area_group.append(area)
            count+=1

area_group.sort()

print(count)
for i in area_group:
    print(i)