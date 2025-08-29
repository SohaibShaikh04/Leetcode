# Write your MySQL query statement below
select E.employee_id, E.name, count(R.reports_to) as reports_count,
round(avg(R.age)) as average_age
from Employees as E, Employees as R
WHERE E.employee_id = R.reports_to
group by E.employee_id
order by E.employee_id