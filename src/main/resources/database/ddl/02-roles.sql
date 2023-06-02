CREATE TABLE IF NOT EXISTS roles (
    id SERIAL,
    name VARCHAR(50) NOT NULL,
    CONSTRAINT "pk_roles" PRIMARY KEY(id),
    CONSTRAINT "roles_unique_name" UNIQUE(name)
);