# COUNT STATEMENT
• The COUNT function returns the number of input rows that match a specific condition of a query.

```
SELECT COUNT(*) FROM tablename;
```


• The COUNT(*) function returns the number of rows returned by a SELECT clause.

    How many departments do we have?




• Similar to the COUNT(*) function, the COUNT(column) function
returns the number of rows returned by a SELECT clause.

• However, it does not consider NULL values in the column.



## COUNT STATEMENT

We can also use COUNT with DISTINCT, for
example:
        
-     How many different type of amount we have?  
-     How many different rating type we have? 


ORDER BY STATEMENT
The ORDER BY clause allows you to sort the rows returned
from the SELECT statement in ascending or descending order based
on criteria specified

