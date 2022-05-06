package students.Sara;

public class lab02 {}
    /*
    1. Show all job_id and average salary who work as any of these jobs IT_PROG, SA_REP, FI_ACCOUNT, AD_VP
2. Show all records whose last name contains 2 lowercase 'a's
3. Display max salary  for each department
4. Display total salary for each department except department_id 50, and where total salary >30000
5. Write a SQL query that returns first and last name any employees who started job between 1-JAN-2000 and 3-SEP-2007 from the hr database
6. Display country_id, country name, region id, region name from hr database
7. Display All cities, country names from hr database
8. display the first name, last name, department number, and department name,  for all employees for departments 80 or 40.
9. Display employees' first name, Lastname department id and all departments including those where do not have any employee.
10. Display the first name, last name, department number, and name, for all employees who have or have not any department
11. Display all employee, and their manager's names

 answers
 1. select job_id, avg(salary) as "average salary" from employees group by job_id
having job_id IN ('IT_PROG', 'SA_REP', 'FI_ACCOUNT', 'AD_VP');

2. select * from employees where last_name LIKE '%a%a%';

3. select max(salary), job_id from employees group by job_id;

4. select department_id, sum(salary) from employees group by department_id
having sum(salary) > 30000 and department_id != 50;

5. select first_name, last_name from employees
where hire_date between '01-JAN-2000' and '03-SEP-2007';

6. select c.country_id, c.country_name, c.region_id, r.region_name
from countries c inner join regions r on c.region_id=r.region_id;

7. select l.city, c.country_name from countries c
inner join locations l on c.country_id=l.country_id;

8. select e.first_name, e.last_name, e.department_id, d.department_name
from employees e inner join departments d
on e.department_id=d.department_id where e.department_id in (80,40);

9. select e.first_name, e.last_name, e.department_id, d.department_name
from departments d left outer join employees e on d.department_id=e.department_id;

10. select e.first_name, e.last_name, e.department_id, d.department_name
from departments d right outer join employees e ON d.department_id=e.department_id;

11. select e1.first_name||' '|| e1.last_name as "Employee Name", e2.first_name||' '||e2.last_name as "Manager Name"
from employees e1 join employees e2 on e1.manager_id=e2.employee_id;


*/
