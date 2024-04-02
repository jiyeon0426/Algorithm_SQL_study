import copy
import sys
import math
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def DFS(x,y):
    global cnt

    graph[x][y]=0 # 방문처리
    cnt+=1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx<0 or nx>=n or ny<0 or ny>=m or graph[nx][ny]==0:
            continue

        DFS(nx,ny)

    return cnt

n,m,tr = map(int,input().split())
graph=[[0]* m for _ in range(n)]

dx=[0,0,1,-1]
dy=[1,-1,0,0]
cnt=0
max_cnt=0

for i in range(tr):
    x,y = map(int,input().split())

    graph[x-1][y-1] = 1

for i in range(n):
    for j in range(m):
        if graph[i][j]==1: # 음식물이 있을 경우
            cnt=0
            DFS(i,j)
            max_cnt = max(cnt,max_cnt)


print(max_cnt)