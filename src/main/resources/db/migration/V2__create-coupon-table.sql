CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE coupon(
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    code VARCHAR(100) UNIQUE NOT NULL,
    discount INTEGER NOT NULL,
    validity TIMESTAMP NOT NULL,
    event_id UUID,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);