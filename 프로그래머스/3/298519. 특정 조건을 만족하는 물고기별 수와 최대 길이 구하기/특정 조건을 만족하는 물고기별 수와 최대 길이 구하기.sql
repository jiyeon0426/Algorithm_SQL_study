SELECT
    COUNT(*) AS FISH_COUNT,
    MAX(LENGTH) AS MAX_LENGTH,
    FISH_TYPE
FROM
    (SELECT
        FISH_TYPE,
        COALESCE(LENGTH, 10) AS LENGTH
    FROM
        FISH_INFO     
    ) AS FI
GROUP BY
    FISH_TYPE
HAVING
    AVG(LENGTH) >= 33
ORDER BY
    FISH_TYPE