# Write your MySQL query statement below
select p.patient_id,
p.patient_name,
p.age,
datediff(n.nega,pos.posi) as recovery_time
from patients p
join (
    select patient_id,
    min(test_date) as posi
    from covid_tests
    where result = 'Positive'
    group by patient_id

) pos
on p.patient_id = pos.patient_id
join (
    select c.patient_id, min(c.test_date) as nega
    from covid_tests c
    join (

        select patient_id,
        min(test_date) as posi
        from covid_tests
        where result = 'Positive' 
        group by patient_id
    )p2
    on c.patient_id = p2.patient_id
    and c.test_date>p2.posi
    where c.result='Negative'
    group by c.patient_id
)n
on p.patient_id = n.patient_id
order by recovery_time,patient_name;
