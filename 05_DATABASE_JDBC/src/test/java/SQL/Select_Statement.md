# SELECT STATEMENT
- First, we specify a list of columns in the table from which we want to
query data in the SELECT statement. We use a comma between
each column in case we want to query data from multiple columns.
- If we want to query data from all column, we can use an asterisk ( * )
as the shorthand for all columns.
- Second, we indicate the table name after the FROM keyword
- SQL language is case INSENSITIVE


## SELECT STATEMENT
- The following illustrates the syntax of the SELECT
statement:
```
SELECT column1, column2… FROM table name ;
```


## SELECT STATEMENT SYNTAX

```
Select * From TableName;
Select ColumnName From TableName;
Select ColumName1, ColumName2 ... From TableName;
Select Column(s) From TableName1, TableName2 
```


## SELECT WHERE STATEMENT
- The **WHERE** clause appears right after the FROM clause of the
SELECT statement.
- The conditions are used to **filter the rows** returned from the
**SELECT** statement.
- PostgreSQL provides us with various standard operators to construct the conditions


