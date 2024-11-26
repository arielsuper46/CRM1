CREATE TABLE IF NOT EXISTS leads (
         id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    status VARCHAR(50),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id BIGINT,
    source VARCHAR(255),
    FOREIGN KEY (customer_id) REFERENCES customer(id)
    );


CREATE TABLE IF NOT EXISTS activity (
     id SERIAL PRIMARY KEY,
     description VARCHAR(255) NOT NULL,
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    lead_id BIGINT,
    FOREIGN KEY (lead_id) REFERENCES leads(id)
    );

INSERT INTO leads (name, status, customer_id, source)
VALUES ('Proyecto Website Personal', 'Nuevo', 1, 'Referido');


INSERT INTO activity (description, lead_id)
VALUES ('Primera reunión de requisitos', 1);

