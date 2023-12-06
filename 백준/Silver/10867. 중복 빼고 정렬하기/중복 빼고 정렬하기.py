import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n = int(input())

count = []
set = set()

count = map(int, input().split())

for i in count:
    set.add(i)

set=sorted(set)

for i in set:
    print(i, end=" ")
