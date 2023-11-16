import sys

sys.setrecursionlimit(10**6)

def dfs(v, distance):
    global relation

    distance += 1
    visited[v] = True

    if v == num2:
        result.append(distance)

    for i in graph[v]:
        if visited[i] == False:
            dfs(i, distance)


n = int(input())  # 9명
visited = [False] * (n + 1)
num1, num2 = map(int, input().split())  # 7 과 3의 촌수 계산하기
k = int(input())  # 입력값 갯수
graph = [[] for _ in range(n + 1)]

for i in range(k):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

distance = 0
result = []

dfs(num1, 0)

if len(result) == 0:  # 촌수 계산 불가능
    print(-1)
else:
    print(result[0] - 1)
