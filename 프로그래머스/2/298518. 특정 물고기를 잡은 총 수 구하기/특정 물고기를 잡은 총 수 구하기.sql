SELECT
    COUNT(*) AS FISH_COUNT
FROM 
    FISH_INFO fi 
    LEFT JOIN FISH_NAME_INFO fni ON fi.fish_type = fni.fish_type
WHERE 
    fni.FISH_NAME = "BASS"
    OR fni.FISH_NAME = "SNAPPER";