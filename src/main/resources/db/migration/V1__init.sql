CREATE TABLE IF NOT EXISTS students
(
    id bigserial ,
    name varchar,
    age integer,
    CONSTRAINT students_pkey PRIMARY KEY (id)
);

INSERT INTO students (name, age)
VALUES
('Олег', 19),
('Максим', 21),
('Мария', 21),
('Екатерина', 18),
('Иван', 19),
('Сергей', 21);