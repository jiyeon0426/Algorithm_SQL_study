import copy
import sys
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def BFS():
    visit = [[False] * m for _ in range(n)]

    q = set()
    q.add((0, 0, graph[0][0]))

    maxCnt=0

    while q:
        x, y, alphabet = q.pop()
        maxCnt = max(len(alphabet), maxCnt)

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx < 0 or nx >= n or ny < 0 or ny >= m or graph[nx][ny] in alphabet:
                continue

            q.add((nx, ny, alphabet + graph[nx][ny]))

    return maxCnt


n, m = map(int, input().split())
graph = []
answer=0
dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

for i in range(n):
    graph.append(list(input().rstrip()))


print(BFS())
