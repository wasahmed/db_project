CREATE Schema IF NOT EXISTS voting;

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

CREATE TABLE IF NOT EXISTS Party (
    Party varchar(20) NOT NULL,
    NumberOfSeats int NOT NULL,
    CONSTRAINT PK_Party PRIMARY KEY(Party)
);

CREATE TABLE IF NOT EXISTS Votes (
	Vote_Id int auto_increment,
    Party varchar(20) NOT NULL,
    User_Id int NOT NULL,
    CONSTRAINT PK_Votes PRIMARY KEY(Vote_Id),
    FOREIGN KEY (User_Id) REFERENCES User(User_Id),
    FOREIGN KEY (Party) REFERENCES Party(Party)
);

INSERT INTO User (`Firstname`, `Surname`, `Id_Number`, `Gender`, `Race`, `Province`) VALUES ("waseem","ahmed", "9602255298089", "male", "indian", "Gauteng");

INSERT INTO `voting`.`party` (`Party`, `NumberOfSeats`) VALUES ("ANC", 0);
INSERT INTO `voting`.`party` (`Party`, `NumberOfSeats`) VALUES ("EFF", 0);
INSERT INTO `voting`.`party` (`Party`, `NumberOfSeats`) VALUES ("DA", 0);
INSERT INTO `voting`.`party` (`Party`, `NumberOfSeats`) VALUES ("IFP", 0);
INSERT INTO `voting`.`party` (`Party`, `NumberOfSeats`) VALUES ("SACP", 0);
