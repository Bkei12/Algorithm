import numpy as np

 #Task1 Create an array filled with a single value (55) Hint: Use np.full() function
print("---------------Task1---------------------")
arr = np.full((3, 3), 55)
print(arr)


#Task2 Create a null vector of size 10 but the fifth value which is 1 
print("---------------Task2---------------------")
arr2 = np.zeros(10)
arr_insert = np.insert(arr2,4 ,1)
print(arr_insert)

#Task3 Reverse a vector (first element becomes last)
print("---------------Task3---------------------")
arr3 = np.arange(10)
print(arr3[::-1])

#Task4 Create a 3x3 matrix with values ranging from 0 to 8 
print("---------------Task4---------------------")
arr4 = np.array([[0,1,2],[3,4,5],[6,7,8]])
print(arr4)

#Task5 Create a 5x5 matrix with row values ranging from 0 to 4 

print("---------------Task5---------------------")
# 0부터 4까지의 값을 가지는 1차원 배열 생성
row_values = np.arange(5)

# 5x5 행렬을 생성하고 각 행에 위에서 생성한 배열을 할당
matrix = np.zeros((5, 5))
matrix[:,:] = row_values

print(matrix)

#Task6 Create a 3D array with zeros along the second axis
print("---------------Task6---------------------")

array_2d = np.zeros((2, 3, 4))
array_2d[:, 1, :] = 2

print(array_2d)

#Task7 How to print the following pattern of nxn using NumPy?


#Task8 Given the following two arrays, add them

print("---------------Task8---------------------")
array = np.array([
    [3, 2, 8],
    [4, 12, 34],
    [23, 12, 67]
])

newRow = np.array([2, 1, 8])

# newRow를 array에 추가하여 새로운 배열을 생성
result = np.vstack((array, newRow))

print(result)

print("---------------Task9---------------------")
A = np.ones(3) * 1
B = np.ones(3) * 2

result = ((A + B) * (-A / 2))

print(result)



print("---------------Task10---------------------")
list = [
    np.array([3, 2, 8, 9]),			#5.5
    np.array([4, 12, 34, 25, 78]),		#30.6
    np.array([23, 12, 67])			#34.0
]

list1 = np.mean(list[0])
list2 = np.mean(list[1])
list3 = np.mean(list[2])

print(list1)
print(list2)
print(list3)


