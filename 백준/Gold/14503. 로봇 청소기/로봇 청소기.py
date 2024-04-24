import sys
import heapq
from collections import deque

input = sys.stdin.readline

n,m = map(int, input().split())

r,c,d = map(int,input().split())

graph=[]

for i in range(n):
    graph.append(list(map(int,input().split())))


dx = [-1,0,1,0] # 북 동 남 서
dy = [0,1,0,-1]

# 사방에 청소할 곳이 있는지 확인하는 함수
def isExist(x,y):
    #global graph, dx, dy, n, m

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0<= nx <n and 0<= ny <m and graph[nx][ny]==0:
            return True

    return False


while True:
    graph[r][c] = 2 # 현재 칸 청소

    if isExist(r,c): # 1.청소할 곳이 있으면
        while True:
            d = (d+3) % 4 # 반시계 방향으로 가는 dx,dy 의 index값

            if graph[r + dx[d]][c + dy[d]] == 0: # 바라보는 방향이 청소가능하면
                r = r + dx[d] # 반시계 방향으로 회전
                c = c + dy[d]
                break

    else: # 2.청소할 곳이 없으면
        if graph[r - dx[d]][c-dy[d]]==1: # 뒤가 벽이면 break
            break
        else: # 벽이 아니라면 후진
            r = r - dx[d]
            c = c - dy[d]

result=0

for i in range(n):
    result += graph[i].count(2)

print(result)