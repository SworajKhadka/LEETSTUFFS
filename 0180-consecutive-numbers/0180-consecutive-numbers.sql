# Write your MySQL query statement below
select distinct num as ConsecutiveNums
from (
    select num,
    Lead(num) over(order by id) as next,
    lag(num) over (order by id) as prev
    from Logs
)temp
where num=prev and num=next;