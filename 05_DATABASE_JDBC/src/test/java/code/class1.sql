-- Day1 class note

-- select all columns from employees table
SELECT * FROM employees;

-- select only job_id column without duplicate value from employees table
SELECT DISTINCT job_id FROM employees;

-- select phone number from employees table without duplicate values
SELECT DISTINCT phone_number FROM employees;

--
SELECT employee_id FROM employees WHERE employee_id = 102;

SELECT * FROM employees WHERE employee_id = 102;

SELECT employee_id,first_name,last_name FROM employees WHERE employee_id = 102;


SELECT employee_id,first_name,last_name, salary FROM employees WHERE SALARY >= 3000 and SALARY <= 6000;

SELECT employee_id,first_name,last_name, salary FROM employees WHERE salary BETWEEN 3000 AND 6000 ORDER BY SALARY ASC;

SELECT employee_id,first_name,last_name, salary FROM employees WHERE salary BETWEEN 3000 AND 6000 ORDER BY SALARY DESC;


SELECT *  FROM LOCATIONS;


SELECT *  FROM LOCATIONS;

SELECT *  FROM LOCATIONS WHERE country_id = 'US' ;

SELECT STATE_PROVINCE as "state", street_address as "street address"  FROM locations WHERE country_id = 'US';

SELECT * FROM DEPARTMENTS WHERE location_id != 1700 ORDER BY manager_id ASC;

SELECT * FROM DEPARTMENTS ORDER BY manager_id ASC;

SELECT * FROM DEPARTMENTS WHERE location_id != 1700 ORDER BY manager_id DESC;


SELECT * FROM DEPARTMENTS WHERE location_id <> 1700 ;

SELECT * FROM DEPARTMENTS;


SELECT * FROM EMPLOYEES;


SELECT * FROM EMPLOYEES WHERE HIRE_DATE not LIKE '%JUN%';

SELECT employee_id, SALARY as "old salary", SALARY+1000 as "salary after promotion", first_name, last_name from employees;

SELECT * FROM EMPLOYEES WHERE first_name not LIKE 'S%';

SELECT * FROM EMPLOYEES WHERE first_name LIKE '%es%';