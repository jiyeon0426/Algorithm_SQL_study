import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n = int(input())

arr=[ [] for _ in range(n)]

for i in range(n):
    a,b,c,d = input().split()

    arr[i]=((a,int(b),int(c), int(d)))

arr= sorted(arr, key=lambda x : (-x[1],x[2],-x[3],x[0]))

for i in arr:
    print(i[0])