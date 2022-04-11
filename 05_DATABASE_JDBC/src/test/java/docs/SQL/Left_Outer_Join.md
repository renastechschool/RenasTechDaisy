# LEFT OUTER JOIN
• Left outer join produces a complete set of records from Table
customer, with the matching records (where available) in Table
Address. If there is no match, the right side will contain null.
```
SELECT customer_id, first_name, last_name, address, phone 
FROM customer 
LEFT OUTER JOIN address
ON customer.address_id = address.address_id;
```


