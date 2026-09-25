-- ============================================================
-- DROP TABLES
-- ============================================================

DROP TABLE IF EXISTS order_item;
DROP TABLE IF EXISTS orders;


-- ============================================================
-- CREATE ORDER
-- ============================================================

CREATE TABLE orders (
id BIGINT PRIMARY KEY,
customer_id BIGINT NOT NULL,
restaurant_id BIGINT NOT NULL,
status VARCHAR(30) NOT NULL,
total DECIMAL(10, 2) NOT NULL
);


-- ============================================================
-- CREATE ORDER ITEM
-- ============================================================

CREATE TABLE order_item (
id BIGINT PRIMARY KEY,
order_id BIGINT NOT NULL,
menu_item_id BIGINT NOT NULL,
quantity INT NOT NULL,

CONSTRAINT fk_order_item_order
FOREIGN KEY (order_id)
REFERENCES orders(id)
);


-- ============================================================
-- ORDERS
-- ============================================================

INSERT INTO orders (id, customer_id, restaurant_id, status, total)
VALUES (1, 1, 1, 'CONFIRMED', 23.00);

INSERT INTO orders (id, customer_id, restaurant_id, status, total)
VALUES (2, 2, 2, 'PREPARING', 23.00);

INSERT INTO orders (id, customer_id, restaurant_id, status, total)
VALUES (3, 3, 3, 'DELIVERED', 25.50);

INSERT INTO orders (id, customer_id, restaurant_id, status, total)
VALUES (4, 1, 2, 'CREATED', 11.00);


-- ============================================================
-- ORDER ITEMS
-- ============================================================

INSERT INTO order_item (id, order_id, menu_item_id, quantity)
VALUES (1, 1, 1, 1);

INSERT INTO order_item (id, order_id, menu_item_id, quantity)
VALUES (2, 1, 2, 1);

INSERT INTO order_item (id, order_id, menu_item_id, quantity)
VALUES (3, 2, 4, 1);

INSERT INTO order_item (id, order_id, menu_item_id, quantity)
VALUES (4, 2, 6, 1);

INSERT INTO order_item (id, order_id, menu_item_id, quantity)
VALUES (5, 3, 7, 1);

INSERT INTO order_item (id, order_id, menu_item_id, quantity)
VALUES (6, 3, 8, 1);

INSERT INTO order_item (id, order_id, menu_item_id, quantity)
VALUES (7, 4, 4, 1);


commit;