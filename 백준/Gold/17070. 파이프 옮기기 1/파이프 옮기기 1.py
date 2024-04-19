import sys
from collections import deque

input = sys.stdin.readline


def DFS(x,y,w):

    global count

    if x==n-1 and y==n-1:
        count+=1
        return

    if 0<=x+1<n and 0<=y+1<n: # 대각선 이동
        if graph[x+1][y+1]==0 and graph[x+1][y]==0 and graph[x][y+1]==0:
            DFS(x+1,y+1,2)
    if w!=1:
        if y+1<n: # 오른쪽 이동
            if graph[x][y+1]==0:
                DFS(x,y+1,0)
    if w!=0:
        if x+1<n: # 아래로 이동
            if graph[x+1][y]==0:
                DFS(x+1,y,1)


dx= [0,1,1] # 우, 하, 대각선 우
dy=[1,0,1]
count=0

n = int(input())

graph=[]

for i in range(n):
    graph.append(list(map(int,input().split())))

DFS(0,1,0)

print(count)