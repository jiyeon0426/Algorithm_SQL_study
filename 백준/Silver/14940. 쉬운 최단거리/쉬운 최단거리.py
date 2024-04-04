import copy
import sys
import math
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)


def BFS(x,y,dist):

    q = deque()
    q.append((x,y,dist))
    visit[x][y] = True
    graph[x][y] = dist

    while q:
        x,y,dist = q.popleft()

        for i in range(4):
            nx = x+dx[i]
            ny = y+dy[i]

            if nx<0 or nx>=n or ny<0 or ny>=m or visit[nx][ny]==True or graph[nx][ny] ==0:
                continue

            q.append((nx,ny,dist+1))
            graph[nx][ny] = dist+1
            visit[nx][ny] = True

n,m = map(int, input().split())
dist=0
graph=[]
visit=[([False] * m) for _ in range(n)]

for i in range(n):
    graph.append(list(map(int,input().split())))

dx = [1,-1,0,0]
dy = [0,0,1,-1]

for i in range(n):
    for j in range(m):
        if graph[i][j]==2 and visit[i][j] == False:
            BFS(i,j,0)

for i in range(n):
    for j in range(m):
        if graph[i][j] == 1 and visit[i][j] == False:
            print(-1, end=' ')
        else:
            print(graph[i][j], end=' ')
    print()