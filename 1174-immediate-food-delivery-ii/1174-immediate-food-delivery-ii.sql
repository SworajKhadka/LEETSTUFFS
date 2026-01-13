# Write your MySQL query statement below
select 
    ROUND(
    COUNT(*)*100.0 /
    (SELECT COUNT(DISTINCT customer_id) FROM Delivery),
    2
) AS immediate_percentage
from Delivery a
where (a.customer_id,a.order_date)in(
    select customer_id, min(order_date)
    from Delivery
    group by customer_id
)
and a.order_date = a.customer_pref_delivery_date;