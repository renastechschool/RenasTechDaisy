# GROUP BY
- The GROUP BY clause divides the rows returned from the
SELECT statement into groups.
- For each group, you can apply an aggregate function, for example:


                — calculating the sum of items

                — count the number of items in the groups



# GROUP BY SYNTAX
```
• SELECT column_1, aggregate_function(column_2)
• FROM table_name
• GROUP BY column_1
```

# HAVING
- We often use the HAVING clause in conjunction with the GROUP BY
clause to filter group rows that do not satisfy a specified condition.
- HAVING Syntax

```
SELECT column_l, aggregate _ function(column_2)
FROM table _name 
GROUP BY column_l 
HAVING condition;
```

- The HAVING statement sets the condition for group rows created
by the GROUP BY clause after the GROUP BY clause applies while
the WHERE clause sets the condition for individual rows before
GROUP BY clause applies.
- This is the main difference between the HAVING and WHERE
clauses


# AS
- AS allows us to rename columns or table selections with an
alias
```
SELECT column_name 
AS new_column_name 
FROM employees
```


# ROWNUM
- It is used for giving limit to the result
```
SELECT column_name 
FROM employees 
WHERE rownum <= 5;
```
.... only displays the given number of rows
