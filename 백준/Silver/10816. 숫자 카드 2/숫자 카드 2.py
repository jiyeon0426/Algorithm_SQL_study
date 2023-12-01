import sys
sys.setrecursionlimit(10**6)
input = sys.stdin.readline

def binary_search(arr, target, start, end):
    if start > end:
        return 0

    mid = (start + end) // 2

    if arr[mid] == target:
        return result.get(target)
    elif arr[mid] < target:
        return binary_search(arr, target, mid + 1, end)
    else:
        return binary_search(arr, target, start, mid - 1)

arr1 = []
arr2 = []
result = {}

n = int(input())
arr1 = list(map(int, input().split()))

m = int(input())
arr2 = list(map(int, input().split()))

arr1.sort()


for i in arr1:
    if i in result:
        result[i] +=1
    else:
        result[i]=1

for i in arr2:
    print(binary_search(arr1,i,0, n-1),end=" ")
