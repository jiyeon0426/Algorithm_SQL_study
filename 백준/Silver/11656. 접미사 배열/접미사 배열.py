import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

str = input()

n = len(str)-1 # baekjoon
tmp_str=""
result=[]

for i in range(n):

    for j in range(i, n):

        tmp_str+= str[j]

    result.append(tmp_str)
    tmp_str=""

result.sort()

for i in result:
    print(i)