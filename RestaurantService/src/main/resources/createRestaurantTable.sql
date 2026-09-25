-- ============================================================
-- DROP TABLES
-- ============================================================

DROP TABLE IF EXISTS restaurant;


-- ============================================================
-- CREATE RESTAURANT
-- ============================================================

CREATE TABLE restaurant (
id BIGINT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
address VARCHAR(255) NOT NULL
);

-- ============================================================
-- RESTAURANTS
-- ============================================================

INSERT INTO restaurant (id, name, address)
VALUES (1, 'Pizza Palace',
        'Bondgenotenlaan 20, Leuven');

INSERT INTO restaurant (id, name, address)
VALUES (2, 'Burger House',
        'Tiensestraat 45, Leuven');

INSERT INTO restaurant (id, name, address)
VALUES (3, 'Sushi World',
        'Naamsestraat 80, Leuven');


commit;