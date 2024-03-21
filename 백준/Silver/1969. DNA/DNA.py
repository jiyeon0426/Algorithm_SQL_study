import sys
sys.setrecursionlimit(10**6)

def reset_dict(dict):
    for str in alpabet:
        my_dict[str] = 0

n,m = map(int, input().split())

arr=[]
alpabet= ["A","C","G","T"]
result_str =[]
my_dict ={}
cnt=0

reset_dict(my_dict)

for i in range(n):
    arr.append(list(input()))

for i in range(m):
    for j in range(n):
        my_dict[arr[j][i]] +=1
    result_str.append(max(my_dict, key=my_dict.get))
    reset_dict(my_dict)


for i in range(n):
    for j in range(m):
        if result_str[j] != arr[i][j]:
            cnt +=1

result_str = ''.join(result_str)
print(result_str)
print(cnt)