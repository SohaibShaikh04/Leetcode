# Write your MySQL query statement below
with cte(id) as (select requester_id from RequestAccepted 
UNION ALL 
select accepter_id from RequestAccepted
)
select  distinct id,
count(id) over (partition by id) as num
from cte
order by num desc limit 1;