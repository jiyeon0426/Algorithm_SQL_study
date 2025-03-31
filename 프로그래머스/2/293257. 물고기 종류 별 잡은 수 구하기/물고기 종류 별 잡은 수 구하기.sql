SELECT
    COUNT(fi.FISH_TYPE) AS FISH_COUNT,
    FISH_NAME
FROM
    FISH_INFO fi
LEFT JOIN 
    FISH_NAME_INFO fni on fi.FISH_TYPE = fni.FISH_TYPE
GROUP BY
    FISH_NAME
ORDER BY
    FISH_COUNT DESC