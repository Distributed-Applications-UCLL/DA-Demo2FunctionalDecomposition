-- ============================================================
-- DROP TABLES
-- ============================================================

DROP TABLE IF EXISTS menu_item;


-- ============================================================
-- CREATE MENU ITEM
-- ============================================================

CREATE TABLE menu_item (
id BIGINT PRIMARY KEY,
name VARCHAR(100) NOT NULL,
price DECIMAL(10, 2) NOT NULL,
restaurant_id BIGINT NOT NULL
);

-- ============================================================
-- MENU ITEMS
-- ============================================================

INSERT INTO menu_item (id, name, price, restaurant_id)
VALUES (1, 'Margherita Pizza', 10.50, 1);

INSERT INTO menu_item (id, name, price, restaurant_id)
VALUES (2, 'Pepperoni Pizza', 12.50, 1);

INSERT INTO menu_item (id, name, price, restaurant_id)
VALUES (3, 'Four Cheese Pizza', 13.50, 1);

INSERT INTO menu_item (id, name, price, restaurant_id)
VALUES (4, 'Classic Burger', 11.00, 2);

INSERT INTO menu_item (id, name, price, restaurant_id)
VALUES (5, 'Cheeseburger', 12.00, 2);

INSERT INTO menu_item (id, name, price, restaurant_id)
VALUES (6, 'Bacon Burger', 13.50, 2);

INSERT INTO menu_item (id, name, price, restaurant_id)
VALUES (7, 'Salmon Sushi', 13.50, 3);

INSERT INTO menu_item (id, name, price, restaurant_id)
VALUES (8, 'California Roll', 11.50, 3);

INSERT INTO menu_item (id, name, price, restaurant_id)
VALUES (9, 'Vegetable Sushi', 10.00, 3);

commit;