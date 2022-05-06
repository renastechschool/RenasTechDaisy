package students.Sara;

public class lab01 {
    /*
    1. List all the employees' first and last name with their salary in employees table
2. how many employees have salary less than 5000?
3. how many employees have salary between 6000 and 7000?
4. List all the different region_ids in countries table
5. display the salary of the employee Grant Douglas (lastName: Grant,  firstName: Douglas)
6. display the maximum salary in employees table
7. display all informations of the employee who has the highest salary in employees table
8. display the the second maximum salary from the employees table
9. display all informations of the employee who has the second highest salary
10. display the the minimum salary in employees table
11. display all informations of the employee who has the minimum salary in employees table
12. display the second minimum salary from the employees table
13. display all informations of the employee who has the second minimum salary
14. display the average salary of the employees;
15. list all the employees who are making above the average salary;
16. list all the employees who are making less than the average salary
17. count the total numbers of the departments in departs table
18. sort the start_date in ascending order in job_history's table
19. sort the start_date in descending order in job_history's table
20. list all the employees whose first name starts with 'A'
21. list all the employees whose job_ID contains 'IT'
22. list all the employees whose department id in 50, 80, 100

answers
1.select first_name, last_name, salary from employees;
--2.select count(*) from employees where salary > 5000;
--3.select count(*) from employees where salary between 6000 and 7000;
--4.select distinct region_id from countries;
--5.select salary from employees where last_name = 'Grant' and first_name = 'Douglas';
--6.select max(salary) from employees;
--7.select * from employees where salary = ( select max(salary) from employees );
--8.select max(salary) from employees where salary < ( select max(salary) from employees );
--9.select * from employees where salary = ( select max(salary) from employees where salary<(select max(salary) from employees) );
--10.select min(salary) from employees;
--11.select * from employees where salary = ( select min(salary) from employees );
--12.select min(salary) from employees where salary > ( select min(salary) from employees );
--13.select * from employees where salaray = ( select min(salary) from employees where salary > (select min(salary) from employees) );
--14.select avg(salary) from employees;
--15.select * from employees where salary > ( select avg(salary) from employees );
--16.select * from employees where salary < ( select avg(salary) from employees );
--17.select COUNT(*) from departments;
--18.select * from job_history order by start_date;
--19.select * from job_history order by start_date desc;
--20.select * from employees where first_name like 'A%';
--21.select * from employees where job_id like '%IT%';
--22.select * from employees where department_id in (80, 50, 100);

     */
}
