CREATE TABLE CLIENTS (
    id BIGSERIAL not null primary key,
    name VARCHAR(150) not null,
    email VARCHAR(150) not null,
    phone VARCHAR(11) not null,
    CONSTRAINT UK_MAIL UNIQUE (email),
    CONSTRAINT UK_PHONE UNIQUE (phone)
);