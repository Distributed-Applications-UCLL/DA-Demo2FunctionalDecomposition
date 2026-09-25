-- ============================================================
-- DROP TABLES
-- ============================================================

DROP TABLE IF EXISTS delivery;

-- ============================================================
-- CREATE DELIVERY
-- ============================================================

CREATE TABLE delivery (
id BIGINT PRIMARY KEY,
order_id BIGINT NOT NULL,
address VARCHAR(255) NOT NULL,
status VARCHAR(30) NOT NULL
);

-- ============================================================
-- DELIVERIES
-- ============================================================

INSERT INTO delivery (id, order_id, address, status)
VALUES (1, 1, 'Main Street 10, Leuven', 'IN_TRANSIT');

INSERT INTO delivery (id, order_id, address, status)
VALUES (2, 2, 'Station Street 25, Leuven', 'PREPARING');

INSERT INTO delivery (id, order_id, address, status)
VALUES (3, 3, 'Park Avenue 5, Brussels', 'DELIVERED');

commit;