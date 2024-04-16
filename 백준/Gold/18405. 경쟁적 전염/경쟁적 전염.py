from collections import deque

def virus_spread(n, k, graph, s, x, y):
    dx = [-1, 1, 0, 0]  # 상, 하, 좌, 우
    dy = [0, 0, -1, 1]
    
    # 바이러스의 증식 순서를 저장하는 큐
    q = deque()
    for virus in range(1, k + 1):
        for i in range(n):
            for j in range(n):
                if graph[i][j] == virus:
                    q.append((i, j, virus, 0))  # 위치, 바이러스 번호, 시간
    
    while q:
        x1, y1, virus, time = q.popleft()
        if time == s:
            return graph[x - 1][y - 1]
        
        for i in range(4):
            nx = x1 + dx[i]
            ny = y1 + dy[i]
            
            if 0 <= nx < n and 0 <= ny < n and graph[nx][ny] == 0:
                graph[nx][ny] = virus
                q.append((nx, ny, virus, time + 1))
    
    return graph[x - 1][y - 1]

# 입력 받기
n, k = map(int, input().split())
graph = [list(map(int, input().split())) for _ in range(n)]
s, x, y = map(int, input().split())

# 결과 출력
print(virus_spread(n, k, graph, s, x, y))
