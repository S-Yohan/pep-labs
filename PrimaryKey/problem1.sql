CREATE TABLE song(

    id SERIAL NOT NULL PRIMARY KEY,
    title varchar(100) NOT NULL,
    artist varchar(100) NOT NULL
);

INSERT INTO song VALUES ('Let it be', 'Beatles');
INSERT INTO song VALUES ('Hotel California', 'Eagles');
INSERT INTO song VALUES ('Kashmir', 'Led Zepplin');

