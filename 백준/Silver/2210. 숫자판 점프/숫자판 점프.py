import sys
sys.setrecursionlimit(10**6)
def DFS(x, y, depth, num):

    if depth ==5:
        number.append(num)
        return

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < 5 and 0 <= ny < 5:
                DFS(nx, ny, depth + 1, num + str(arr[nx][ny]))


dx = [0, 0, -1, 1] # 좌, 우, 상, 하
dy = [-1, 1, 0 , 0]

arr= []
number = []

for i in range(5):
    arr.append(list(map(int, input().split())))

for i in range(5):
    for j in range(5):
        DFS( i,j,0,str(arr[i][j]))

print(len(set(number))) # 중복된 수를 제외한 서로 다른 여섯 자리 수의 개수 출력