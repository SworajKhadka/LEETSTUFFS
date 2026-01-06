# Write your MySQL query statement below
select user_id,email 
from Users 
where regexp_like(
    email,
     '^[A-Za-z0-9_]*@[a-z]*\\.com$',
     'c'
)
order by user_id asc;
