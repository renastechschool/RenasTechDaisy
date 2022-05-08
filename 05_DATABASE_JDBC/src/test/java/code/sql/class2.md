-- Day2 class note

-- select first_name,last_name,salary columns from employees table.
select first_name,last_name,salary from employees;

--COUNT ( counting number of rows which meet with condition)

-- select salary from from employees table which are under 5000.
select salary from employees where salary<5000;

-- count number of people who make under 5000 from employees table.
select count(*) from employees where salary <5000;

-- count number of people who make between 6000 and 7000 from employees table.
select count(*) from employees where salary between 6000 and 7000;

-- select salary from from employees table which are between 6000 and 7000.
select salary from employees where salary between 6000 and 7000;

--DISTINCT ( eliminate duplicate values)

-- select region_id from countries table.
SELECT REGION_ID FROM countries;

-- display region_id from countries table without duplicate value and ascending order by region_id
SELECT DISTINCT REGION_ID FROM countries ORDER BY region_id ASC;

-- display region_id from countries table without duplicate value and descending order by region_id
SELECT DISTINCT REGION_ID FROM countries ORDER BY region_id DESC;

-- display Douglas Grant salary from employees table.
select salary from employees where first_name = 'Douglas' and last_name = 'Grant';


-- MAX MIN AVG ( find max min avg value in specific column)

-- display max salary from employees table.
select max(salary) from employees;

-- display person details from employees table who makes highest salary.
select * from employees where salary = (select max(salary) from employees);

-- SELECT * FROM employees ORDER BY salary DESC LIMIT 2,1;
Select Max(Salary) from employees where salary< (Select Max(Salary) from employees where salary<(Select Max(Salary) from employees));

-- display min salary from employees table.
select min(salary) from employees;

-- display person details from employees table who makes lowest salary.
select * from employees where salary = (select min(salary) from employees);

-- display average slary from employees table
select avg(salary) from employees;

-- 
select first_name,salary from employees order by salary desc;

select * from (select first_name,salary from employees order by salary desc)  where rownum < 4 order by salary;

-- LIKE '%IT%' (find the rows which contains given keyword)

select * from employees where job_id LIKE '%IT%';

SELECT first_name, last_name, salary FROM employees e1 WHERE 3-1 = (SELECT COUNT(DISTINCT salary ) FROM employees e2 WHERE e2.salary > e1.salary);

--isNULL (find null rows)


select * from employees;

select * from employees WHERE manager_id is null;

select * from employees WHERE department_id is null;

-- UPPER AND LOWER (can turn the words in the column to lower or UPPER case)

select * from regions;

SELECT REGION_NAME, UPPER(region_name) FROM regions;

SELECT REGION_NAME, LOWER(region_name) FROM regions;

-- LENGTH (will calculate lenght of the given row)

SELECT REGION_NAME, LENGTH(region_name) FROM regions;

SELECT REGION_NAME, LENGTH(region_name) FROM regions WHERE LENGTH(region_name) <= 8;


select * from employees;

SELECT LOWER(first_name), UPPER(last_name) FROM employees WHERE LENGTH(first_name) = 4 ;


SELECT LOWER(first_name)|| ',' || UPPER(last_name) as "first name and last name" FROM employees WHERE LENGTH(first_name) = 4 ;


-- DUAL ( there is a dummy table called dual where we can try things out

SELECT 'HELLO WORLD' , LENGTH('HELLO WORLD'), LOWER('HELLO WORLD') FROM DUAL;


-- INSTR -- LIKE INDEX OF JAVA

SELECT INSTR('WORLD' ,'W'),INSTR('WORLD' ,'L'), INSTR('WORLD' ,'OR'), INSTR('WORLD' ,'BLA')  FROM DUAL;


-- INITCAP -- FIRST LETTER CAP AND REST LOWER CASE

SELECT INITCAP('WORLD'), INITCAP('WorLd'), INITCAP('world') FROM DUAL;


-- ROUND the decimal number to closest 'number'

SELECT ROUND(3.14), ROUND(3.14, 1), ROUND(3.145789, 3) FROM DUAL;

SELECT ROUND(3.99), ROUND(3.12), ROUND(3.5) FROM DUAL;


-- TRUNC 

SELECT TRUNC(7.99) FROM DUAL;


select DEPARTMENT_ID from departments;


-- 10-200-1700 => uuid, concatenate the rows

select DEPARTMENT_ID || '-'|| MANAGER_ID || '-'|| LOCATION_ID from departments;