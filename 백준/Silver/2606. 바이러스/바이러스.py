import sys
from collections import deque
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

def dfs(graph, v, visit):
    global count
    visit[v]=True

    for i in graph[v]: #노드와 연결된 인접노드 방문
        if visit[i] == False: # 인접 노드를 방문하지 않앗다면
            visit[i] = True # 방문 처리
            count +=1
            dfs(graph, i, visit)


n = int(input()) # 컴퓨터의 수
m = int(input()) # 입력값 수 , 연결된 컴퓨터의 쌍

count = 0

visit = [False] * (n+1)

graph = [[] for _ in range(n+1)] # 0~n까지

for i in range(m):
    x,y = list(map(int, input().split()))
    graph[x].append(y)
    graph[y].append(x)

dfs(graph, 1, visit)
print(count)