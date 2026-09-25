-- ============================================================
-- DROP TABLES
-- ============================================================

DROP TABLE IF EXISTS payment;

-- ============================================================
-- CREATE PAYMENT
-- ============================================================

CREATE TABLE payment (
id BIGINT PRIMARY KEY,
order_id BIGINT NOT NULL,
amount DECIMAL(10, 2) NOT NULL,
status VARCHAR(30) NOT NULL
);


-- ============================================================
-- PAYMENTS
-- ============================================================

INSERT INTO payment (id, order_id, amount, status)
VALUES (1, 1, 23.00, 'PAID');

INSERT INTO payment (id, order_id, amount, status)
VALUES (2, 2, 23.00, 'PAID');

INSERT INTO payment (id, order_id, amount, status)
VALUES (3, 3, 25.50, 'PAID');

commit;