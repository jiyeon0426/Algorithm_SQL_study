import copy
import sys
import math
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def DFS(x,y,h):
    if visit[x][y] == 0 or area[x][y] <= h or x<0 or x>=n or y<0 or y>=n:
        return False

    visit[x][y]=0

    for i in range(4):
        nx = x+dx[i]
        ny = y+dy[i]

        if 0 <= nx <n and 0 <= ny < n:
            DFS(nx,ny,h)

    return True


n = int(input())
area=[]
max_h = 100

dx=[1,-1,0,0]
dy=[0,0,1,-1]

for i in range(n):
    area.append(list(map(int, input().split())))

max_area=0
for h in range(max_h+1):
    visit= [[1] * n for _ in range(n)]
    safe_area=0

    for i in range(n):
        for j in range(n):
            if DFS(i,j,h):
                safe_area+=1
    max_area = max(max_area, safe_area)

print(max_area)