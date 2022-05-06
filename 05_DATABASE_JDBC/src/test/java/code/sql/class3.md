-- Day3 class note

-- GROUP BY

select JOB_ID from employees GROUP BY JOB_ID;

select JOB_ID, COUNT(*) from employees WHERE JOB_ID ='IT_PROG' GROUP BY JOB_ID;

select avg(salary),JOB_ID, COUNT(*) from employees GROUP BY JOB_ID;

select JOB_ID, COUNT(*) from employees GROUP BY job_id having count(*) > 10;

-- can you group the table by manager_id, and display how many people belongs each manager_id

select manager_id, count(*) from employees group by manager_id;

--- BREAK

select JOB_ID, COUNT(*) from employees GROUP BY job_id having job_id = 'IT_PROG';

select job_id from employees group by job_id (;

-- SUBQUERY 

select * from employees;

select * from departments;

-- display people who working at administration department

select * from employees where department_id = 110;

select * from employees where department_id IN (select department_id from departments where department_name = 'Accounting');

select department_id from departments where department_name = 'Accounting';

-- display first name and last name from employees table also department name from departments table

select * from employees;

select * from departments;

select first_name, last_name, department_id from employees;

select employee_id,first_name, last_name, department_name, departments.department_id
from employees, departments 
where employees.department_id = departments.department_id ORDER BY employees.employee_id asc;

select * from employees;

select * from jobs;

-- display first_name, last_name from employees job_title from jobs table

select e.first_name , e.last_name, j.job_title
from employees e , jobs j
where e.job_id = j.job_id;