# IN STATEMENT
- We use the **IN** operator with the **WHERE** clause to check if a value
matches any value in a list of values.


- The syntax of the **IN** operator is as
follows: value **IN** (valuel,value2,...)


**IN STATEMENT**
- The list of values is not limited to a list of numbers or strings but also a
result set of a SELECT statement as shown in the following query:


    Value IN (SELECT value FROM tbl_name)
    

- Just like with BETWEEN, you can use NOT to adjust an IN statement
(NOT IN