# Write your MySQL query statement below

WITH customer_t AS (
  SELECT id, name FROM Customers
),
order_t AS (
  SELECT DISTINCT customerId FROM Orders
)
SELECT c.name as Customers
FROM customer_t c
LEFT JOIN order_t o ON c.id = o.customerId
WHERE o.customerId IS NULL;
