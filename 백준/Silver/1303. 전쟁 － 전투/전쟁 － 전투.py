import sys
from collections import deque

input = sys.stdin.readline

def DFS(x,y,w):
    global cnt
    visited[x][y] = True
    cnt += 1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx <0 or nx >=m or ny<0 or ny>=n or visited[nx][ny]==True or graph[nx][ny] != w:
            continue


        DFS(nx,ny,w)


n,m = map(int, input().split()) # 열,행

dx=[1,-1,0,0]
dy=[0,0,1,-1]

graph=[]
visited = [[False] * n for _ in range(m)]

cnt=0

a=0
b=0

for i in range(m):
    graph.append(input().rstrip())

for i in range(m):
    for j in range(n):
        if graph[i][j] == 'W' and visited[i][j] == False:
            cnt=0
            DFS(i,j,'W')
            a += (cnt*cnt)

        if graph[i][j] == 'B' and visited[i][j]==False:
            cnt=0
            DFS(i,j,'B')
            b += (cnt*cnt)

print(a,b)