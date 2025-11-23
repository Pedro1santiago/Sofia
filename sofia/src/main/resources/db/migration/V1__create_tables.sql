
CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);


CREATE TABLE IF NOT EXISTS user_interaction (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    whatsapp_number VARCHAR(50),
    age INT,
    interaction_date TIMESTAMP
);


CREATE TABLE IF NOT EXISTS opinion (
    id SERIAL PRIMARY KEY,
    user_id BIGINT REFERENCES user_interaction(id),
    opinion_text TEXT,
    created_at TIMESTAMP
);
