# SELF JOIN
- We have learned how to join a table to the other tables using
**INNER JOIN,LEFT OUTER JOIN or RIGHT OUTER JOIN**
statements.


- However, there is a special case that you join a table to itself,
which is known as self join.


![Desi.](img/selfjoin.png)


## SELF JOIN

- **SELECT** e1.first_name, e1.last_name,
e1.manager_id,e2.last_name
- **FROM** employees e1 JOIN employees e2
- **ON** e1.manager_id = e2.employee_id;


We use self join when we want to combine rows with other rows in the
same table. To perform the self join operation, we must use a table
alias to help SQL distinguish the left table from the right table of the
same table.