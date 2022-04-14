## What is data?
- Piece of information
- For example: Bank account ?
  - Account Number -> 123
  - Account Type -> Checking
  - User Firstname -> John
  - Last name -> Smith
  - Balance -> 100,000


## Data is also this ... 
- All above data needs to be stored somewhere, where it is secure,
easy to  ready, fast to read, easy and fast to update.
- In databases we store data in an organized manner.


## What is database?
- Database is a systematic collection of data.
- Databases support storage and  manipulation of
data.
- Databases make data management easy

## Relational database?
- organize that data in a series of
tables

| Employee_ID | Employee_Name | Employee_Address |

|    #007     |     James      |        VA        |

|    #008     |    Aaron      |        KY        |

|    #009     |    John       |        CA        |

|    #010     |    Ruckus     |        WA        |


##  Relational Database

- tables are related to each other using Primary and foreign keys


## Non-Relational Database
- All Data are in Key & Value format


[

first_name: 'Dexter',

last_name: 'Lanas',

city: 'Vancouver',

location: [45.123], [47.232],

phones: [

[phone number: '111.111.1111',

type: mobile,

person_ID: 1, ...]

[phone number: '444.444.4444',

type: home,

person_ID: 1, ...]

[phone number: '777.777.7777',

type: office,

person_ID: 1, ...

]



]
]

]

## Database Management System

- Create, maintains and organize the
database
- Easier to manage the database
- Improves the availability of the information
- Does have backup 


## RDBMS

- RDBMS --> Relational Database management system.
- All RDBMS using SQL language
- Relational Database --> tables are related to each other using Primary and  foreign keys


## What is Primary Key?

- Primary key --> unique column in Every table in a
database.
- Primary key column can only accept
- non-duplicated values and
- cannot be NULL

## What is a Foreign Key?
- Foreign Key --> is a column that comes from a different table
and using  Foreign key tables are related to each other.
- Foreign key is the primary key of another table
- It can be duplicate or null for another table

## What is SQL?
- SQL - > STRUCTURED QUERY LANGUAGE
- SQL is a language that is used to work with
Databases and  manipulate data.


##SQL Statements

### Data Manipulation Language (DML) :

| SELECT |  INSERT |  UPDATE  | DELETE  |  MERGE |


### Data Definition Language (DFL) :

| CREATE  |  ALTER  |  DROP  |  RENAME  | TRUNCATE 
 |  COMMENT  |


### Data Control Language (DCL) :

|  GRANT  |  REVOKE  |


### Transaction Control :

|  COMMIT  |  ROLLBACK  |  SAVEPOINT  |


## What is QUERY in SQL?

- A set of instructions. 
- Telling Database Management System that we would like to do.

    - Select * from Employees;
    - Select email from Employees where first_name = 'Steven' and last_name = 'King';


# Data Types in Queries

- Int & Integer: Whole numbers
- Decimal: decimal numbers
- VarChar: string of text
- Date: "YYYY-MM-DD"
- Timestamp: "YYYY-MM-DD  HH:MM:SS"
- Boolean: true & false; Boolean expressions

# Select Statement

- First, we specify a list of columns in the table from which we want
to query  data in the SELECT statement. We use a comma
between each column in  case we want to query data from multiple
columns.
- If we want to query data from all column, we can use an asterisk
( * ) as the  shorthand for all columns.
- Second, we indicate the table name after the FROM keyword
- SQL language is case INSENSITIVE


# Select Statement Syntax
- Select* From TableName;
- SelectColumnName From TableName;
- Select ColumName1, ColumName2 ... From
TableName;
- SelectColumn(s) From TableName1,TableName2;


# Select Distinct Statement
- The DISTINCT keyword can be used to return only distinct
(different)  values.
    - SELECT DISTINCT column1, column2... FROM
table_name ;

# Select Where Statement
- The WHERE clause appears right after the FROM clause of the SELECT  statement.
- The conditions are used to filter the rows returned from the SELECT  statement.
- PostgreSQL provides us with various standard operators to construct the  conditions.


# Where Clause Syntax
- SELECT column_1, column_2.. column_n
- FROM table_name
- WHERE conditions;