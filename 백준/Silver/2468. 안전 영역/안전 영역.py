import sys

sys.setrecursionlimit(10**6)

def DFS(x, y, h):
    if x < 0 or x >= n or y < 0 or y >= n or visit[x][y] == 0 or area[x][y] <= h:
        return False
    
    visit[x][y] = 0
    
    directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]  # 상하좌우
    for dx, dy in directions:
        nx, ny = x + dx, y + dy
        if 0 <= nx < n and 0 <= ny < n:
            DFS(nx, ny, h)
    
    return True

n = int(input())
area = []
for _ in range(n):
    area.append(list(map(int, input().split())))

max_height = max(max(row) for row in area)

result = 0
for h in range(max_height+1):  # 모든 높이에 대해 반복
    visit = [[1] * n for _ in range(n)]  # 방문 여부 초기화
    safe_areas = 0
    for i in range(n):
        for j in range(n):
            if DFS(i, j, h):
                safe_areas += 1
    result = max(result, safe_areas)

print(result)
