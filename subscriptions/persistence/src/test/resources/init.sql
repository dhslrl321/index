drop table if exists subscriptions CASCADE;

CREATE TABLE subscriptions
(
    id   VARCHAR(255) PRIMARY KEY,
    user_id VARCHAR(255),
    status VARCHAR(255),
    name VARCHAR(255)
);
