# 고양이와 개는 몇 마리 있을까

SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE) AS count 
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
HAVING ANIMAL_TYPE IN ('Cat', 'Dog')
ORDER BY ANIMAL_TYPE


------------------------------------------------------

# 진료과별 총 예약 횟수 출력하기

SELECT MCDP_CD AS 진료과코드, COUNT(APNT_NO) AS 5월예약건수
FROM APPOINTMENT
WHERE APNT_YMD LIKE '2022-05%'
GROUP BY MCDP_CD
ORDER BY 5월예약건수, MCDP_CD

------------------------------------------------------
# 동명 동물 수 찾기

SELECT NAME, COUNT(*) AS COUNT
FROM ANIMAL_INS 
WHERE NAME IS NOT NULL
GROUP BY NAME 
HAVING COUNT >= 2
ORDER BY NAME

------------------------------------------------------
#성분으로 구분한 아이스크림 총 주문량

SELECT B.INGREDIENT_TYPE, SUM(A.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF AS A, ICECREAM_INFO AS B
WHERE A.FLAVOR = B.FLAVOR
GROUP BY B.INGREDIENT_TYPE
ORDER BY TOTAL_ORDER


-- 계좌 이체 트랜잭션 예시
BEGIN TRANSACTION; -- 트랜잭션 시작

-- 송금 계좌에서 금액 감소
UPDATE 계좌
SET 잔액 = 잔액 - 100
WHERE 계좌번호 = '123';

-- 수신 계좌에서 금액 증가
UPDATE 계좌
SET 잔액 = 잔액 + 100
WHERE 계좌번호 = '456';

-- 트랜잭션 완료
COMMIT;

-- 지속성 확인
-- 트랜잭션이 완료된 후에도 변경 사항이 데이터베이스에 남아 있는지 확인
SELECT *
FROM 계좌
WHERE 계좌번호 IN ('123', '456');

