-- 코드를 입력하세요
SELECT A.PRODUCT_ID, A.PRODUCT_NAME, SUM(A.PRICE * B.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT A
JOIN FOOD_ORDER B ON A.PRODUCT_ID = B.PRODUCT_ID
WHERE MONTH(B.PRODUCE_DATE) = 5 AND YEAR(B.PRODUCE_DATE) = 2022
GROUP BY PRODUCT_ID
ORDER BY TOTAL_SALES DESC , PRODUCT_ID ASC
