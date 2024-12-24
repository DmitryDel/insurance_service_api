CREATE TABLE InternationalPassport (
    id SERIAL PRIMARY KEY,
    series VARCHAR(255) NOT NULL,
    personId BIGINT,
    FOREIGN KEY (personId) REFERENCES Person(id)
);

CREATE TABLE CarInsurance (
    id SERIAL PRIMARY KEY,
    number INT NOT NULL,
    price INT NOT NULL,
    personId BIGINT,
    FOREIGN KEY (personId) REFERENCES Person(id)
);
