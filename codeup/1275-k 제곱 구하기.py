n = int(input())
lst = list(map(int,input().split()))


first = lst[0]
mid = lst[n//2] # //는 나눗셈의 목값만 반환한다.
last = lst[-1]

print(first, mid, last)