-- Day3 class note

-- join

/*
select table1.column1,......,table2.column
from table1
join table2 on table1.id = table2.id;

*/

select * from employees;

select * from departments;

--- display a table which have first_name, last_name, department_name //alies

select e.first_name, e.last_name, d.department_id ,d.department_name  
from employees e 
inner join departments d 
on e.department_id = d.department_id;

--

select * from countries;

select * from regions;


--- COUNTRY NAME AND REGION NAME BY JOINING COUNTRY AND REGION TABLE

select c.country_name, r.region_name
from countries c
join regions r
on c.region_id = r.region_id;

select c.country_name, r.region_name
from countries c
join regions r
using(region_id);

-- LEFT JOIN

select * from employees;

select * from departments;

--- display a table which have first_name, last_name, department_name with left join
-- employees left
-- departments right

select e.first_name, e.last_name, d.department_name
from employees e
left join departments d
on e.department_id = d.department_id;

--LEFT JOIN

-- diplay only department_name is null from above table

select e.first_name, e.last_name, d.department_name
from employees e
left join departments d
on e.department_id = d.department_id
where d.department_name is not null;

select e.first_name, e.last_name, d.department_name
from employees e
left join departments d
on e.department_id = d.department_id
where d.department_name is null;

-- RIGHT JOIN

select * from employees;

select * from departments;

select e.first_name, e.last_name, d.department_name
from employees e
RIGHT join departments d
on e.department_id = d.department_id;


--2 sessions per week mob programming
-- navigator kefo driver

select e.first_name, e.last_name, d.department_name
from employees e
RIGHT join departments d
on e.department_id = d.department_id
WHERE e.first_name is null;


-- FULL JOIN

select * from employees;

select * from departments;

select e.first_name, e.last_name, d.department_name
from employees e
full join departments d
on e.department_id = d.department_id;

select e.first_name, e.last_name, d.department_name
from employees e
full join departments d
on e.department_id = d.department_id
WHERE d.department_name is null;

select e.first_name, e.last_name, d.department_name
from employees e
full join departments d
on e.department_id = d.department_id
where e.first_name is null;