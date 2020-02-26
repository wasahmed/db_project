USE voting;

CREATE TABLE IF NOT EXISTS User (
	User_Id int auto_increment,
    Firstname varchar(20) NOT NULL,
    Surname varchar(20) NOT NULL,
    Id_Number char(13) NOT NULL,
    Gender varchar(6) NOT NULL,
    Race varchar(10) NOT NULL,
    Province varchar(15) NOT NULL,
    CONSTRAINT PK_User PRIMARY KEY (User_Id)
);

CREATE TABLE IF NOT EXISTS Votes (
	Vote_Id int auto_increment,
    Party varchar(20) NOT NULL,
    User_Id varchar(20) NOT NULL,
    CONSTRAINT PK_Votes PRIMARY KEY(Vote_Id),
    FOREIGN KEY (User_Id) REFERENCES User(User_Id),
    FOREIGN KEY (Party) REFERENCES Party(Party)
);

CREATE TABLE IF NOT EXISTS Party (
    Party varchar(20) NOT NULL,
    NumberOfVotes int NOT NULL,
    NumberOfSeats int NOT NULL,
    CONSTRAINT PK_Party PRIMARY KEY(Party)
);