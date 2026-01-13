SELECT
    t1.visited_on,
    SUM(t2.daily_amount) AS amount,
    ROUND(AVG(t2.daily_amount), 2) AS average_amount
FROM (
    SELECT visited_on, SUM(amount) AS daily_amount
    FROM Customer
    GROUP BY visited_on
) t1
JOIN (
    SELECT visited_on, SUM(amount) AS daily_amount
    FROM Customer
    GROUP BY visited_on
) t2
ON t2.visited_on BETWEEN DATE_SUB(t1.visited_on, INTERVAL 6 DAY)
                     AND t1.visited_on
GROUP BY t1.visited_on
HAVING COUNT(*) = 7
ORDER BY t1.visited_on;
