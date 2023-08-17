n = int(input())
lst = list(map(int,input().split()))


first = lst[0]
mid = lst[n//2]
last = lst[-1]

print(first, mid, last)