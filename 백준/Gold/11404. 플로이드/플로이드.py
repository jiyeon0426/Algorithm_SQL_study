import copy
import sys
import math
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def Floid():
    for k in range(1,n+1):
        for i in range(1,n+1):
            for j in range(1,n+1):
                graph[i][j]=min(graph[i][j],graph[i][k]+graph[k][j])

n = int(input())
m = int(input())
y=0
graph = [[math.inf]* (n+1) for _ in range(n+1)]

for i in range(m):
    x,y,z = map(int, input().split())
    graph[x][y] = min(z,graph[x][y])

Floid()



for i in range(1,n+1):
    for j in range(1,n+1):
        if i==j:
            graph[i][j]=0
        if graph[i][j]==math.inf:
            graph[i][j]=0


for i in range(1,n+1):
    for j in range(1,n+1):
        print(graph[i][j], end=' ')
    print()


#print(BFS())
