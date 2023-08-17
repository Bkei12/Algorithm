a , b = map(int,input().split())

plus = 0
minus = 0

for i in range(a,b+1):
    if i % 2 == 1:
        plus += i
    else:
        minus+= i

result = plus - minus
print(result)