# Like Statement
- Suppose the store manager asks you find an employee that he
does not remember the name exactly.
- He just remembers that employee's first name begins with
something like Jen.

![Desi.](img/like.png)



- How do you find the exact employee that the store manager is asking?
- You may find the employee in the employee table by looking at
  the first name column to see if there is any value that begins with
  Jen.
- It is kind of tedious because there are many rows in the customer
  table
  The query returns rows whose values in the first name column
  begin with Jen and may be followed by any sequence of characters.
- This technique is called **pattern matching**.


## LIKE STATEMENT
- You construct a pattern by combining a string with **wildcard
characters** and use the **LIKE** or **NOT LIKE** operator to find the
matches.
- Percent ( **%**) for matching **any sequence of characters.**
- Underscore ( **_** ) for matching **any single** character.


