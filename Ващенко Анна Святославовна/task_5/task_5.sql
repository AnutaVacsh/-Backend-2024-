CREATE TABLE Department (
	ID SERIAL PRIMARY KEY,
	SALARY VARCHAR(15)
);

CREATE TABLE Users (
    ID SERIAL PRIMARY KEY ,
    SURNAME VARCHAR(15),
	DEPARTMENT_ID INT REFERENCES Department(ID),
	SALARY INT
);

INSERT INTO Department (SALARY)
VALUES
('Backend'),
('DevOps'),
('Android'),
('iOS')

INSERT INTO Users (SURNAME, DEPARTMENT_ID, SALARY)
VALUES
('Алексеев', 3, 50000),
('Петрухин', 3, 60000),
('Есенин', 2, 70000),
('Маяковский', 1, 80000),
('Нортон', 4, 90000),
('Антропов', 1, 100000),
('Андреев', 4, 110000),
('Силантьев', 1, 120000)

