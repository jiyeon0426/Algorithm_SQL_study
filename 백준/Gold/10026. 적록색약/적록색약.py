import copy

import sys
from collections import deque
sys.setrecursionlimit(10000)


def dfs(arr, x,y, color):

    arr[x][y] = 0


    for i in range(4):

        nx = x + dx[i]
        ny = y + dy[i]

        if nx<0 or nx >=n or ny<0 or ny>=n:
            continue

        if arr[nx][ny]== color: # RGB
            arr[nx][ny]=0
            dfs(arr,nx,ny,color)

def weakness_dfs(arr, x,y, color, plus_color):

    arr[x][y] = 0


    for i in range(4):

        nx = x + dx[i]
        ny = y + dy[i]

        if nx<0 or nx >=n or ny<0 or ny>=n:
            continue

        if arr[nx][ny]== color or arr[nx][ny]==plus_color: # RGB
            arr[nx][ny]=0
            weakness_dfs(arr,nx,ny,color,plus_color)

n = int(input()) # n

graph=[]


RGB = ["R","G","B"]
normal_view =0
color_weakness = 0

dx= [-1, 1, 0, 0] # 상, 하, 좌, 우
dy= [0, 0, -1, 1]

for i in range(n):
    graph.append(list(input()))

copied_graph =copy.deepcopy(graph)


for i in range(n): #정상인
    for j in range(n):
        if graph[i][j]=="R":
            dfs(graph, i,j, "R")
            normal_view +=1
        if graph[i][j]=="G":
            dfs(graph, i,j, "G")
            normal_view +=1
        if graph[i][j]=="B":
            dfs(graph, i,j, "B")
            normal_view +=1


for i in range(n): #적록색약
    for j in range(n):
        if copied_graph[i][j]=="R" or copied_graph[i][j]=="G":
            weakness_dfs(copied_graph, i,j, "R","G")
            color_weakness+=1
        if copied_graph[i][j]=="B":
            dfs(copied_graph, i,j, "B")
            color_weakness+=1

print(normal_view, color_weakness)
