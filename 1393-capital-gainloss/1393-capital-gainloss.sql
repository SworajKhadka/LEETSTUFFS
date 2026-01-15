SELECT stock_name, sella - buya AS capital_gain_loss
FROM (
    SELECT 
        stock_name,
        SUM(CASE WHEN operation = 'Sell' THEN price ELSE 0 END) AS sella,
        SUM(CASE WHEN operation = 'Buy' THEN price ELSE 0 END) AS buya
    FROM Stocks
    GROUP BY stock_name
) AS summary;
