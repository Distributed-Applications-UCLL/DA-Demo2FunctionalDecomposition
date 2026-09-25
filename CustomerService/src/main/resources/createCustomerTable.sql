-- ============================================================
-- DROP TABLES
-- ============================================================

DROP TABLE IF EXISTS customer;


-- ============================================================
-- CREATE CUSTOMER
-- ============================================================

CREATE TABLE customer (
id BIGINT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
email VARCHAR(150) NOT NULL UNIQUE,
address VARCHAR(255) NOT NULL
);


-- ============================================================
-- CUSTOMERS
-- ============================================================

INSERT INTO customer (id, name, email, address)
VALUES (1, 'Alice Johnson', 'alice@example.com',
        'Main Street 10, Leuven');

INSERT INTO customer (id, name, email, address)
VALUES (2, 'Bob Smith', 'bob@example.com',
        'Station Street 25, Leuven');

INSERT INTO customer (id, name, email, address)
VALUES (3, 'Charlie Brown', 'charlie@example.com',
        'Park Avenue 5, Brussels');

INSERT INTO customer (id, name, email, address)
VALUES (4, 'Diana Miller', 'diana@example.com',
        'Market Street 18, Mechelen');


commit;