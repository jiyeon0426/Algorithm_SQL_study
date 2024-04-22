import sys
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**4)
def BFS(x,y):

    q=deque()
    q.append((x,y))
    visited[x][y]=1

    while q:
        x,y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx<0 or nx>=n or ny<0 or ny>=m or graph[nx][ny]==0 or visited[nx][ny]==1:
                continue

            visited[nx][ny] = 1
            q.append((nx,ny))

def melting():
    for i in range(n):
        for j in range(m):
            graph[i][j] = max(0, graph[i][j] - visited[i][j])

def count_area(x,y):

    q=deque()
    q.append((x,y))

    while q:
        x,y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx<0 or nx>=n or ny<0 or ny>=m or visited[nx][ny]>0:
                continue

            if graph[nx][ny] == 0: # 주변이 바닷물일 경우
                visited[x][y] += 1



n,m = map(int, input().split())
graph=[]
cnt_island=0
count=0
dx=[1,-1,0,0]
dy=[0,0,1,-1]



for i in range(n):
    graph.append(list(map(int, input().split())))

while True:
    visited = [[0]*m for _ in range(n)]

    for i in range(1,n):
        for j in range(1,m):
            if graph[i][j]> 0:#빙산이 있을 경우
                count_area(i,j)
    melting()
    count+=1

    visited = [[0]*m for _ in range(n)]
    cnt_island=0
    for i in range(n):
        for j in range(m):
            if graph[i][j] >0 and visited[i][j] !=True:
                BFS(i,j)
                cnt_island+=1

    if cnt_island == 0:
        print(0)
        break

    if cnt_island >=2:
        print(count)
        break
