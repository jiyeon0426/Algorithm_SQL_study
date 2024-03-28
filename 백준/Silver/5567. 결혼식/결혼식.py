import copy
import sys
from collections import deque

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def BFS(x):

    d=0

    q = deque()
    q.append((x,d))

    while q:
        num, distance = q.popleft()
        visit[num]=True

        if distance > 1:
            return

        for neighbor in friend[num]:
            if visit[neighbor] != True:
                q.append((neighbor, distance+1))
                visit[neighbor] = True

n = int(input())
m = int(input())
answer=0
visit = [False]* (n+1)
friend= [[] for _ in range(n+1)]

for i in range(m):
    x, y = map(int, input().split())
    friend[x].append(y)
    friend[y].append(x)

BFS(1)
answer = visit[2:].count(True)
print(answer)