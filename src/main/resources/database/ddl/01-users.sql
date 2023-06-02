CREATE TABLE IF NOT EXISTS "users" (
    id UUID NOT NULL,
    username VARCHAR(50) NOT NULL,
    password TEXT NOT NULL,
    email VARCHAR(50) NOT NULL,
    CONSTRAINT "pk_users" PRIMARY KEY(id),
    CONSTRAINT "users_unique_email" UNIQUE(email)
);