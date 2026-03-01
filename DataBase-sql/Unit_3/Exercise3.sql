-- 2025/11/19
-- Álvaro Acosta ORtega

create database if not exists Friends;
USE Friends;

-- Creating table "agenda"

drop table if exists Agenda;
CREATE TABLE agenda(
	name VARCHAR(20),
    dwelling VARCHAR(20),
	phone VARCHAR(11)
);
SHOW TABLES;
DESCRIBE Agenda;
DROP TABLE IF EXISTS Agenda;

-- Creating table "books"

DROP TABLE IF EXISTS Books;
CREATE TABLE Books(
	title VARCHAR(20),
    author VARCHAR(30),
    editorial VARCHAR(15)
);
SHOW Tables;
describe Books;
DROP TABLE IF EXISTS books;