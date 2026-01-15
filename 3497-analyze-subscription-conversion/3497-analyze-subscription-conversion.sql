# Write your MySQL query statement below
select user_id,
Round(Avg(case when activity_type='free_trial'then activity_duration else null end),2)as trial_avg_duration,
Round(Avg(case when activity_type='paid'then activity_duration else null end),2)as paid_avg_duration
from UserActivity
where user_id in(
    select user_id 
    from UserActivity
    where activity_type='paid'
    group by user_id
)
group by user_id;