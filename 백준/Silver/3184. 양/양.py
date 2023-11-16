import copy

import sys
from collections import deque
sys.setrecursionlimit(10**6)

def dfs(x,y):

    global wolf
    global sheep

    if graph[x][y]=='v':
        wolf+=1
    elif graph[x][y]=='o':
        sheep+=1

    graph[x][y]=0 #방문 시 0 처리

    for i in range(4):

        nx = x+dx[i]
        ny = y+dy[i]

        if nx<0 or nx>=n or ny<0 or ny>=m or graph[nx][ny]=="#"  or graph[nx][ny]==0: #벽을 만나거나, 영역을 벗어나면 무시
            continue

        dfs(nx,ny)


n, m = map(int, input().split())

wolf =0
sheep=0

graph = []
result=[]

total_sheep=0
total_wolf=0

dx=[-1,1,0,0]
dy=[0,0,-1,1]

for i in range(n):
    graph.append(list(input()))

for i in range(n):
    for j in range(m):
        if graph[i][j]=="." or graph[i][j]=="o" or graph[i][j]=="v": # .일경우
            sheep,wolf = 0,0
            dfs(i,j)

            if sheep>wolf: # 양이 더 많으면 늑대 0
                wolf=0
            else:
                sheep=0

            total_wolf +=wolf
            total_sheep+=sheep

print(total_sheep, total_wolf)
