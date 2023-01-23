CREATE TABLE post(
    id SERIAL NOT NULL,
    post varchar(255),     
    user_fk int NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_fk) REFERENCES user(id)
);