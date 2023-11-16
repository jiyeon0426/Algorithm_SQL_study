import sys
from collections import deque

sys.setrecursionlimit(10**6)

def dfs(graph, v, visited, goal, distance):
    global relation
    visited[v] = True

    if v == goal:
        relation = True
        return distance

    for i in graph[v]:
        if not visited[i]:
            next_distance = dfs(graph, i, visited, goal, distance + 1)
            if next_distance > 0:  # 목표에 도달한 경우에만 거리를 반환
                return next_distance

    return -1  # 목표에 도달하지 못한 경우

# 전체 사람의 수 n
n = int(input())

# 촌수를 계산해야 하는 서로 다른 두 사람의 번호 num1, num2
num1, num2 = map(int, input().split())

# 부모 자식들 간의 관계의 개수 m
m = int(input())

# 부모 자식 간의 관계를 나타내는 그래프 graph
graph = [[] for _ in range(n+1)]

for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

# 방문 여부를 나타내는 visited 배열
visited = [False] * (n+1)

# 초기 촌수 및 연관 여부 설정
distance = 0
relation = False

# DFS 수행
result = dfs(graph, num1, visited, num2, distance)

# 결과 출력
print(result)
