import copy
import sys
import math
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)


def DFS(x,y):
    global area
    graph[x][y]= 0
    area+=1

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < m and graph[nx][ny]==1:
            DFS(nx,ny)

    return area

n,m = map(int, input().split())
graph=[]
count=0
area=0
max_area=0

dx=[1,-1,0,0]
dy=[0,0,1,-1]

for i in range(n):
    graph.append(list(map(int,input().split())))


for i in range(n):
    for j in range(m):
        if graph[i][j] == 1:
            area = 0
            max_area = max(DFS(i,j),max_area)
            count+=1

print(count)
print(max_area)