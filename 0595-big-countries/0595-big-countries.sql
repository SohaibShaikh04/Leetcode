# Write your MySQL query statement below
WITH big_countries(name, population, area) AS (
    SELECT name, population, area FROM World
)
SELECT name, population, area
FROM big_countries
WHERE area >= 3000000 OR population >= 25000000;
