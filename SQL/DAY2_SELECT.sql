# 강원도에 위치한 생산공장 목록 출력하기

SELECT FACTORY_ID, FACTORY_NAME, ADDRESS 
FROM FOOD_FACTORY
WHERE ADDRESS LIKE '강원도%'
ORDER BY FACTORY_ID


------------------------------------------------------

# 조건에 맞는 회원수 구하기

SELECT COUNT(USER_ID) AS USERS
FROM USER_INFO
WHERE DATE_FORMAT(JOINED, '%Y') = '2021' AND 
AGE BETWEEN 20 AND 29

------------------------------------------------------

# 동물의 아이디와 이름

SELECT ANIMAL_ID, NAME FROM ANIMAL_INS
ORDER BY ANIMAL_ID

------------------------------------------------------

# 역순 정렬하기

SELECT NAME, DATETIME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID DESC

