import sys
import heapq
from collections import deque

input = sys.stdin.readline

INF = int(1e9)

city = int(input())

bus = int(input())

distance = [INF] * (city+1)

graph = [[] for _ in range(city+1)]

for i in range(bus):
    a,b,c = map(int, input().split())

    graph[a].append((b,c)) # 노드,거리


start, arrive = map(int, input().split())

def dijkstra(start):

    q = []
    heapq.heappush(q,(start, 0)) #노드와 거리
    distance[start] =0

    while q:

        now, dist = heapq.heappop(q)

        if distance[now] < dist:
            continue

        for i in graph[now]:

            cost = dist + i[1]

            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (i[0] ,cost))


dijkstra(start)

print(distance[arrive])