n = int(input())

# 위쪽 부분 출력
for i in range(n, 0, -1):
    spaces = n - i
    stars = 2 * i - 1
    print(" " * spaces + "*" * stars)

# 아래쪽 부분 출력
for i in range(2, n + 1):
    spaces = n - i
    stars = 2 * i - 1
    print(" " * spaces + "*" * stars)
