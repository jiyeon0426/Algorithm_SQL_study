import copy

import sys
from collections import deque
sys.setrecursionlimit(10**6)

def dfs(graph,x,y):

    global count

    graph[x][y]= 7
    count+=1

    for i in range(4):
        nx = x+dx[i]
        ny = y + dy[i]

        if nx<0 or nx>=n or ny<0 or ny>=m:
            continue

        if graph[nx][ny] == 0:
            dfs(graph,nx,ny)

n,m,k = map(int, input().split()) # 5, 7, 3

count=0
result = []
area_count=0

dx=[-1,1,0,0] # 상,하,좌,우
dy = [0,0,-1,1]


graph=[[0] * m for _ in range(n)]

# for i in range(n):
#     print(graph[i])


for i in range(k): # 입력 개수
    x,y,x1,y1= map(int,input().split())


    for i in range(y,y1):
        for j in range(x,x1):
            graph[i][j]=1


for i in range(n):
    for j in range(m):
        if graph[i][j]==0:
            count=0
            dfs(graph,i,j)
            area_count+=1
            result.append(count)

result.sort()

print(area_count)
for i in result:
    print(i,end=" ")