CREATE TABLE IF NOT EXISTS Operator(
    ID IDENTITY NOT NULL,
    CODE VARCHAR(15),
    NAME VARCHAR(50),
    NICKNAME VARCHAR(25),
    TYPE VARCHAR(4),
    ICON VARCHAR(20),
    MAIN VARCHAR(20),
    DOB DATE,
    ORG VARCHAR(10),
    BIRTHPLACE VARCHAR(30),
    ARMOR VARCHAR(5),
    SPEED VARCHAR(5),
    SPECGADGET VARCHAR(150)
);

CREATE TABLE IF NOT EXISTS Map(
    ID IDENTITY NOT NULL,
    CODE VARCHAR(15),
    NAME VARCHAR(20),
    LOCATION VARCHAR(30),
    TERRAINTYPE VARCHAR(50),
    IMG VARCHAR(50),
    IMGBAS VARCHAR(50),
    IMGGR VARCHAR(50),
    IMGFRST VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Operators_Maps(
    OPERATOR_ID INT NOT NULL,
    MAP_ID INT NOT NULL,
    CONSTRAINT fk_operator FOREIGN KEY (OPERATOR_ID) REFERENCES Operator(ID) ON DELETE CASCADE,
    CONSTRAINT fk_map FOREIGN KEY (MAP_ID) REFERENCES Map(ID) ON DELETE CASCADE
);

