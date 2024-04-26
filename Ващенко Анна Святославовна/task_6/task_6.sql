SELECT d.salary, COUNT(u.id), AVG(u.salary) FROM 
Users u JOIN Department d ON u.department_id = d.id
GROUP BY d.salary