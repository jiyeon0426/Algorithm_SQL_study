import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

n = int(input())

count = []
dict={}

for i in range(n):
    str = input()

    if str in dict:
        dict[str] +=1
    else:
        dict[str] =1


result = sorted(dict.items(), key=lambda x: (-x[1],x[0]))

print(result[0][0])

# max_value = max(dict.values())
#
# for key,value in dict.items():
#     if value==max_value:
#         print(key)
#         break