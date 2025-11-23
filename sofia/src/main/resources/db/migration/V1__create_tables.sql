CREATE TABLE IF NOT EXISTS users (
    id BIGSERIAL PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    localizacao VARCHAR(50),
    estado VARCHAR(100),
    cidade VARCHAR(100),
    bairro VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS user_interaction (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    whatsapp_number VARCHAR(50),
    age INT,
    interaction_date TIMESTAMP,
    localizacao VARCHAR(50),
    estado VARCHAR(100),
    cidade VARCHAR(100),
    bairro VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS context (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE IF NOT EXISTS opinion (
    id BIGSERIAL PRIMARY KEY,
    user_id BIGINT REFERENCES user_interaction(id),
    opinion_text TEXT,
    created_at TIMESTAMP,
    relevancia INT,
    context_id BIGINT REFERENCES context(id)
);
