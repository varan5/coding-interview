Write an SQL query to print details of workers excluding first names, “Vipul” and “Satish” from Worker table.



SELECT * FROM Worker WHERE FIRST_NAME NOT IN ('Vipul', 'Satish');
