--Activity 1 Creating the table
CREATE TABLE salesman(salesman_id int Primary Key, salesman_name varchar2(20), salesman_city varchar2(20), commission int);
DESCRIBE salesman;

--Activity 2 Inserting the values
INSERT ALL
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 FROM DUAL;
SELECT * FROM salesman;

--Activity 3 Selecting only few columns based on the input
SELECT salesman_id, salesman_city FROM salesman;
SELECT * FROM salesman WHERE salesman_city='Paris';
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

--Activity 4 Addingnew column grade to the table
ALTER TABLE salesman ADD grade int;
UPDATE salesman SET grade= 100;
SELECT * FROM salesman;

--Activity 5
--Update the grade score of salesmen from Rome to 200.
UPDATE salesman SET grade=200 WHERE salesman_city='Rome';
--Update the grade score of James Hoog to 300.
UPDATE salesman SET grade=300 WHERE salesman_name='Pit Alex';
--Update the name McLyon to Pierre.
UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';
SELECT * FROM salesman;