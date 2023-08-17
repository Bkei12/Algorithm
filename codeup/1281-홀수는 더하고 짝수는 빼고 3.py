a, b = map(int, input().split())

plus = 0
minus = 0
lst = []
for i in range(a, b + 1):
    if i % 2 == 1:
        if a ==i:
            plus += i
            result1 = str(i)
            lst.append(result1)
        
        else:
            plus += i
            result1 = "+"+str(i)
            lst.append(result1)
    
    elif i % 2 == 0:
        minus += i
        result2 = "-" + str(i)
        lst.append(result2)

result = plus - minus
print(''.join(lst[0:])+"="+str(result)) #''.join함수는 리스트를 문자열로 변환해주는 함수이다.