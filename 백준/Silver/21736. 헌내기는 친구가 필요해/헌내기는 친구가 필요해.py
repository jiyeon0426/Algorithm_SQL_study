import copy

import sys
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def DFS(x,y):

    global count

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if nx >=n or nx <0 or ny>=m or ny<0 or graph[nx][ny]=="X":
            continue

        if graph[nx][ny] == "O":
            graph[nx][ny] = "X"

        if graph[nx][ny] =="P":
            graph[nx][ny] ="X"
            count +=1

        DFS(nx,ny)

graph= []

n,m = map(int, input().split())
for _ in range(n):
    graph.append(list(input().rstrip()))

count=0

dx = [-1,1,0,0]
dy= [0,0,-1,1]


for i in range(n):
    for j in range(m):
        if graph[i][j] == "I": # 도연이
            DFS(i,j)

if count <= 0:
    count = "TT"

print(count)