-- Day1 class note

-- select all columns from employees table
SELECT * FROM employees;

-- select only job_id column without duplicate value from employees table.
SELECT DISTINCT job_id FROM employees;

-- select phone number from employees table without duplicate values.
SELECT DISTINCT phone_number FROM employees;

-- select the employee from employees table which is employee_id equal 102, only display employee_id column.
SELECT employee_id FROM employees WHERE employee_id = 102;

-- select the employee from employees table which is employee_id equal 102, display all columns.
SELECT * FROM employees WHERE employee_id = 102;

-- select the employee from employees table which is employee_id equal 102, display employee_id,first_name,last_name columns.
SELECT employee_id,first_name,last_name FROM employees WHERE employee_id = 102;

-- select employees which make between 3000 and 6000, display employee_id,first_name,last_name, salary columns.
SELECT employee_id,first_name,last_name, salary FROM employees WHERE SALARY >= 3000 and SALARY <= 6000;

-- select employees which make between 3000 and 6000. display employee_id,first_name,last_name, salary (with ascending order by salary) columns.
SELECT employee_id,first_name,last_name, salary FROM employees WHERE salary BETWEEN 3000 AND 6000 ORDER BY SALARY ASC;

-- select employees which make between 3000 and 6000. display employee_id,first_name,last_name, salary (with descending order by salary) columns.
SELECT employee_id,first_name,last_name, salary FROM employees WHERE salary BETWEEN 3000 AND 6000 ORDER BY SALARY DESC;

-- select all columns from locations table.
SELECT *  FROM LOCATIONS;

-- select all columns from locations table but only display locations in US.
SELECT *  FROM LOCATIONS WHERE country_id = 'US' ;

-- select STATE_PROVINCE(display column name "state") and street_address(display column name "street address") columns but only display locations in US.
SELECT STATE_PROVINCE as "state", street_address as "street address"  FROM locations WHERE country_id = 'US';

-- select all columns from departments table but not the location_id is 1700, dislay it ascending order by manager_id.
SELECT * FROM DEPARTMENTS WHERE location_id != 1700 ORDER BY manager_id ASC;

-- select all columns from departments table , display it ascending order by manager_id.
SELECT * FROM DEPARTMENTS ORDER BY manager_id ASC;

-- select all columns from departments table but not the location_id is 1700, dislay it descending order by manager_id.
SELECT * FROM DEPARTMENTS WHERE location_id != 1700 ORDER BY manager_id DESC;

-- select all columns from departments table but not the location_id is 1700, dislay all columns.
SELECT * FROM DEPARTMENTS WHERE location_id <> 1700 ;

-- select all columns from departments table
SELECT * FROM DEPARTMENTS;

-- select all columns from employees table
SELECT * FROM EMPLOYEES;

-- select all columns from employees table but not display people who get hired in June.
SELECT * FROM EMPLOYEES WHERE HIRE_DATE not LIKE '%JUN%';

-- select employee_id , salary(display column name "old salary") , salary(add 1000 to each employee and display column name "salary after promotion"), 
-- first_name, and last_name from employees table
SELECT employee_id, SALARY as "old salary", SALARY+1000 as "salary after promotion", first_name, last_name from employees;

-- display all columns from employees table, but only display first_name not start with "S".
SELECT * FROM EMPLOYEES WHERE first_name not LIKE 'S%';

-- display all columns from employees table, but only display first_name contain "es" in any position.
SELECT * FROM EMPLOYEES WHERE first_name LIKE '%es%';