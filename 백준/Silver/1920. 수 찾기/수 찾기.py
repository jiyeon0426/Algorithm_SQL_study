import sys
from collections import deque
sys.setrecursionlimit(10**6)
input = sys.stdin.readline


n = int(input())

arr1 = list(map(int, input().split()))
arr1.sort()

m = int(input())

arr2 = list(map(int, input().split()))


def binary_search(array, target, start, end):
    if start > end:
        return  None
    mid = (start+end) //2

    if array[mid] == target:
        return mid
    elif array[mid] > target:
        return binary_search(array,target,start,mid-1)
    elif array[mid]<target:
        return binary_search(array, target, mid+1,end)


for element in arr2:
    result = binary_search(arr1, element, 0, len(arr1)-1)

    if result==None:
        print(0)
    else:
        print(1)