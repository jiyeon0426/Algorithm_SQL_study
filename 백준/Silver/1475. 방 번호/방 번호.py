import sys
sys.setrecursionlimit(10**6)

arr = list(map(int, str(input())))  # 여러 숫자를 한 번에 입력 받음

d = {}
answer = 0

for i in range(10):
    d[i] = 0

for i in arr:
    d[i] += 1

d[6] += d[9]
d[9] = 0

# 값이 동일한 경우 key가 6이 아닌 다른 key를 우선으로 선택
max_key = max(d, key=lambda k: (d[k], k != 6))

if max_key == 6:
    answer = (d[max_key] + 1) // 2  # 6과 9는 하나의 세트로 취급되므로 하나만 남았을 경우도 세트 1개로 취급
else:
    answer = d[max_key]

print(answer)
