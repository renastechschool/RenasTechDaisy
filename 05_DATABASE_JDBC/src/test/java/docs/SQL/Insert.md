# INSERT
- When you create a new table, it does not have any data.
- The first thing you often do is to insert new rows into the table.
- SQL provides the INSERT statement that allows you to insert one or
more rows into a table at a time.




- First, you specify the name of the table that you want to insert a new
row after the INSERT INTO clause, followed by a comma-separated
column list.
- Second, you list a comma-separated value list after the VALUES clause.


The value list must be in the same order as the columns list specified
after the table name.
```
INSERT INTO table_name (column1, column2, ...)
VALUES (value1, value2,…)
```
To add multiple rows into a table at a time, you use the following
syntax:
```
INSERT INTO table (column1, column2,…)
VALUES (value1, value2 ),(value1, value2, ...),…
```


