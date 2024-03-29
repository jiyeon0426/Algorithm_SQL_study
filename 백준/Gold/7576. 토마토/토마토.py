import copy
import sys
import math
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def BFS():
    time=0
    while q:
        x1,y1,time = q.popleft()
        tomato[x1][y1] = 1

        for i in range(4):
            nx = x1+dx[i]
            ny = y1+dy[i]

            if nx<0 or nx>=n or ny<0 or ny>=m or tomato[nx][ny]==1 or tomato[nx][ny]==-1:
                continue

            q.append((nx,ny,time+1))
            tomato[nx][ny]=1

    return time


m,n = map(int,input().split())
tomato=[]
visit=[[False] * m for _ in range(n)]
q=deque()
answer=0
cnt=0

dx=[1,-1,0,0]
dy=[0,0,1,-1]

arr=[]

for i in range(n):
    tomato.append(list(map(int,input().split())))


for i in range(n):
    for j in range(m):
        if tomato[i][j] ==1:
            q.append((i,j,0))

answer= BFS()

for i in range(n):
    cnt+=tomato[i].count(0)

if cnt>0:
    answer=-1

print(answer)