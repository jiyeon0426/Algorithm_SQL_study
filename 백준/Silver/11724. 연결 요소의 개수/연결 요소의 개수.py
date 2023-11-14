import sys
from collections import deque
sys.setrecursionlimit(10**6)
input = sys.stdin.readline
def dfs(graph, v, visit):
    visit[v] = True

    for i in graph[v]:
        if not visit[i]:  # 방문하지 않았다면
            dfs(graph, i,visit)


n, m = map(int, input().split())  # 노드 개수, 간선 수 (입력 수)
arr = [[] for _ in range(n + 1)]
count=0

visit = [False] * (n + 1)  # 노드 개수에 맞게 크기 동적 설정

for i in range(m):
    x, y = map(int, input().split())
    arr[x].append(y)
    arr[y].append(x)

for i in range(1, n+1):
    if visit[i] == False:
        dfs(arr, i, visit)
        count+=1

print(count)
