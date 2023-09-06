# Write your MySQL query statement below
select E.name as Employee from Employee as E, Employee as M where E.salary > M.salary and E.managerId = M.id  ;