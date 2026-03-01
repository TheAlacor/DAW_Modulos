
-- Creating database 

CREATE DATABASE IF NOT EXISTS Suppliers;
USE Suppliers;


-- Creating tables

DROP TABLE IF EXISTS Suppliers;
CREATE TABLE IF NOT EXISTS Suppliers(
    pr VARCHAR(2),
    name VARCHAR(30),
    state INT,
    city VARCHAR(30),
    PRIMARY KEY(pr)
);


DROP TABLE IF EXISTS Pieces;
CREATE TABLE IF NOT EXISTS Pieces(
    pz VARCHAR(2),
    name VARCHAR(30),
    color VARCHAR(10),
    weight INT,
    city VARCHAR(30),
    PRIMARY KEY(pz)
);


DROP TABLE IF EXISTS Supplies;
CREATE TABLE IF NOT EXISTS Supplies(
    code INT,
    pr VARCHAR(2),
    pz VARCHAR(2),
    amount INT,
    PRIMARY KEY(code),
    FOREIGN KEY(pr) REFERENCES Suppliers(pr),
    FOREIGN KEY(pz) REFERENCES Pieces(pz)
);


-- Setting values

INSERT INTO Suppliers VALUES ('S1', 'Salazar', 20, 'Londres'),
                             ('S2', 'Jaimes', 10, 'París'),
                             ('S3', 'Bernal', 30, 'París'),
                             ('S4', 'Corona', 20, 'Londres'),
                             ('S5', 'Aldana', 30, 'Atenas');

INSERT INTO Pieces VALUES ('P1', 'tuerca', 'verde', 12, 'París'),
                          ('P2', 'perno', 'rojo', 17, 'Londres'),
                          ('P3', 'birlo', 'azul', 17, 'Roma'),
                          ('P4', 'birlo', 'rojo', 14, 'Londres'),
                          ('P5', 'birlo', 'azul', 12, 'París'),
                          ('P6', 'engranaje', 'rojo', 17, 'París');

INSERT INTO Supplies VALUES (1, 'S1', 'P1', 300),
                            (2, 'S1', 'P2', 200),
                            (3, 'S1', 'P3', 400),
                            (4, 'S1', 'P4', 200),
                            (5, 'S1', 'P5', 100),
                            (6, 'S1', 'P6', 100),
                            (7, 'S2', 'P1', 300),
                            (8, 'S2', 'P2', 400),
                            (9, 'S3', 'P2', 200),
                            (10, 'S4', 'P2', 200),
                            (11, 'S4', 'P4', 300),
                            (12, 'S4', 'P5', 400);

-- Exercises

-- -----------------------------------------------------------------------------------------------------------------------------------

-- CASE 1

ALTER TABLE Supplies ADD CONSTRAINT FOREIGN KEY(pr) REFERENCES Suppliers(pr);
ALTER TABLE Supplies ADD CONSTRAINT FOREIGN KEY(pz) REFERENCES Pieces(pz);

-- 1. Can we remove the Suppliers row which corresponds to S1?

DELETE FROM Suppliers  -- This will throw an error, the table Supplies rely on it
WHERE pr = 'S1';

-- 2. Can we remove the Suppliers row which corresponds to S5?

DELETE FROM Suppliers   -- There are no values in any other table which relies on that row. Hence, it won't throw any error
WHERE pr = 'S5';

-- 3. Which supplier can be removed?
-- Only the ones that not have their rows in different tables relying on it

-- 4. Can we remove from supplies the send from the supplier S1 to the piece P2?

DELETE FROM Supplies   -- Yes, it can be removed
WHERE pr = 'S1' AND pz = 'P2';

-- 5. In general, which supplies can be removed?
-- Since there are no tables relying on supplies, all the values here can be removed


-- 6. Can we add in supplies a send from the supplier S1 to the piece P7 with the amount of 300?

INSERT INTO Supplies VALUES (13, 'S1', 'P7', 300);

-- At first glance, it may work if we don't repeat the supply's code. Howbeit, there is not a piece P7, forcing it to throw an error


-- 7. Can we add in supplies a send from the supplier S1 to the piece P6 with the amount of 200?

INSERT INTO Supplies VALUES (13, 'S1', 'P6', 200);

-- We absolutely can, checking that the new supply's code is not repeated


-- 8. Can we add in supplies a send from the supplier S2 to the piece P3 with the amount of 400?

INSERT INTO Supplies VALUES (14, 'S2', 'P3', 200);

-- We can as long as the new supply's code is unique in the table  --- change id 13->14


-- 9. In general, when can we add new supplies in the supplies table?
-- We can add new elements to the table supplies when the new supply's code is not repeated and the given supplier and piece exist in their own table
ALTER TABLE Supplies ADD CONSTRAINT FOREIGN KEY(pr) REFERENCES Suppliers(pr);

-- 10. Can we remove the piece's row which corresponds to P6?

DELETE FROM Pieces
WHERE pz = 'P6';

-- We cannot because there is a supply in the supplies table which relies on this piece

-- 11. In general, which pieces can be removed?
-- The pieces that have no supplies relying on it are the only one that can be removed


-- -----------------------------------------------------------------------------------------------------------------------------------

-- CASE 2

ALTER TABLE Supplies ADD CONSTRAINT FOREIGN KEY(pr) REFERENCES Suppliers(pr) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE Supplies ADD CONSTRAINT FOREIGN KEY(pz) REFERENCES Pieces(pz);


-- 1. Can we remove the supplier's row which corresponds to S1?

DELETE FROM Suppliers -- No,because S1 from suppliers is relying in the table supplies
WHERE pr = 'S1';

-- 2. What happened with the supplies which rely on S1?
-- The data in supplies will also change

-- 3. Can we remove the supplier's row which corresponds to S5?

DELETE FROM Suppliers
WHERE pr = 'S5';

-- Yes, we can

-- 4. In general, which supplier can be removed?
-- The pieces that have no supplies relying on it are the only one that can be removed

-- 5. Can we remove the supply of the send from S2 to P2?

DELETE FROM Supplies
WHERE pr = 'S2' AND pz = 'P2'; -- Yes, because we are selecting both foreign keys so we are not forcing any error

-- 6. In general, which supplies can be removed?
-- All of them

-- 7. Can we remove the pieces's row which corresponds to P6?

DELETE FROM Pieces
WHERE pz = 'P6';

-- No, it will throw an error,because p6 from pieces si relying in the table supplies





