n = int(input())
now = 'prime'

for i in range(2, n):
    if n % i == 0:
        now = 'not prime'
        break

print(now)