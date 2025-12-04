# Write your MySQL query statement below

WITH SALARY_T AS (
   select max(salary) as SecondHighestSalary from Employee
   where salary < (select max(salary) from Employee)
)
select SecondHighestSalary from SALARY_T;