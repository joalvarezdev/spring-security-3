CREATE TABLE IF NOT EXISTS user_roles(
    user_id UUID NOT NULL,
    role_id int,
    CONSTRAINT "pk_user_roles" PRIMARY KEY(user_id, role_id),
    CONSTRAINT "fk_users" FOREIGN KEY (user_id) REFERENCES users,
    CONSTRAINT "fk_roles" FOREIGN KEY (role_id) REFERENCES roles
);