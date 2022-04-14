

![Desi.](img/joins.png)

![Desi.](img/innerjoin.png)

# INNER JOIN
1) First, we specify the column in both tables from which you want to
select data in the SELECT clause
2) Second, we specify the main table i.e., Address in the FROM clause.
3) Third, we specify the table that the main table joins to i.e., Customer in
the INNER JOIN clause. In addition, you put a join condition after the
ON keyword i.e, Address.address_id = customer.address_id

- For each row in the Address table, PostgreSQL scans the Customer
Table to check if there is any row that matches the condition;
Address.Address_id = Customer.address_id;
- If it finds a match, it combines columns of both rows into one row and
add the combined row to the returned result set.


![Desi.](img/innerjoin2.png)


![Desi.](img/innerjoin3.png)




# Inner Join Customer and Address
![Desi.](img/innerjoinCustomer.png)

![Desi.](img/innerjoinAddress.png)
```
SELECT customer_id, first_name, last_name, address,
phone 
FROM customer 
INNER JOIN address
ON customer.address_id = address.address_id;
```

![Desi.](img/innerjoin5.png)

![Desi.](img/innerjoin6.png)