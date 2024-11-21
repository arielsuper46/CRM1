CREATE TABLE IF NOT EXISTS customer (
     id SERIAL PRIMARY KEY,
     name VARCHAR(255) NOT NULL,
     email VARCHAR(255),
     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );

INSERT INTO customer (name, email)
VALUES ('Juan Perez', 'juanito12@gmail.com');
