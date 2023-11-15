import copy

import sys
from collections import deque
sys.setrecursionlimit(10000)

def bfs(graph, x,y):
    queue = deque()
    queue.append((x,y))
    count=0

    while queue: # 큐가 빌때까지

        x, y = queue.popleft()

        if x == goal_x and y==goal_y: # 목표 좌표에 도착했을 시 종료
            return graph[x][y]

        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx<0 or nx>=n or  ny<0 or ny>=n:
                continue

            if graph[nx][ny]==0: # 방문하지 않앗다면
                graph[nx][ny] = graph[x][y] + 1 # 방문시 해당영역 +1
                queue.append((nx,ny))

testcase = int(input())

count=0

# 나이트 이동가능 좌표
dx = [-1,-2,-2,-1, 1, 2,2,1] # 8가지 경우
dy = [-2,-1,1, 2,-2,-1,1,2 ]

# 체스판 한변 길이
# 현재 나이트가 있는 칸
# 나이트가 이동하려고 하는 칸

graph=[]

for i in range(testcase):
    n = int(input()) #체스판 한변 길이

    current_x , current_y = map(int, input().split()) # 현재 좌표
    goal_x, goal_y = map(int, input().split()) # 목표 좌표

    graph = [[0]* n for _ in range(n)]

    result = bfs(graph, current_x, current_y)
    print(result)
