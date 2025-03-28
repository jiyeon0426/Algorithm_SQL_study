SELECT
    SUM(SCORE) AS SCORE,
    he.EMP_NO,
    EMP_NAME,
    POSITION,
    EMAIL
FROM
    HR_EMPLOYEES he
    JOIN HR_DEPARTMENT hd on he.DEPT_ID = hd.DEPT_ID
    JOIN HR_GRADE hg on hg.EMP_NO = he.EMP_NO
GROUP BY
    he.EMP_NO
ORDER BY
    SCORE DESC
LIMIT 1