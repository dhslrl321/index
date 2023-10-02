drop table if exists subscriptions CASCADE;

CREATE TABLE subscriptions
(
    id   VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255)
);
