CREATE TABLE `User` (
	`Id` int NOT NULL AUTO_INCREMENT,
	`UserName` varchar(20) NOT NULL UNIQUE,
	`Password` varchar(30) NOT NULL,
	`Rank` varchar(15) NOT NULL,
	`Equipment` int NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `Vet/Nov Ref Table` (
	`VeteranId` int NOT NULL,
	`NoviceId` int NOT NULL
);

CREATE TABLE `Equipment` (
	`Id` int NOT NULL AUTO_INCREMENT,
	`WeaponId` int NOT NULL,
	`HeadId` int NOT NULL,
	`ArmsId` int NOT NULL,
	`ChestId` int NOT NULL,
	`WaistId` int NOT NULL,
	`LegsId` int NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `Messages` (
	`Id` int NOT NULL AUTO_INCREMENT,
	`ToUser` int NOT NULL,
	`FromUser` int NOT NULL,
	`Message` varchar(140) NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `Weapons` (
	`Id` int NOT NULL AUTO_INCREMENT,
	`Name` varchar(50) NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `Heads` (
	`Id` int NOT NULL AUTO_INCREMENT,
	`Name` varchar(50) NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `Chests` (
	`Id` int NOT NULL AUTO_INCREMENT,
	`Name` varchar(50) NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `Waists` (
	`Id` int NOT NULL AUTO_INCREMENT,
	`Name` varchar(50) NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `Legs` (
	`Id` int NOT NULL AUTO_INCREMENT,
	`Name` varchar(50) NOT NULL,
	PRIMARY KEY (`Id`)
);

CREATE TABLE `Arms` (
	`Id` int NOT NULL AUTO_INCREMENT,
	`Name` varchar(50) NOT NULL,
	PRIMARY KEY (`Id`)
);

ALTER TABLE `User` ADD CONSTRAINT `User_fk0` FOREIGN KEY (`Equipment`) REFERENCES `Equipment`(`Id`);

ALTER TABLE `Vet/Nov Ref Table` ADD CONSTRAINT `Vet/Nov Ref Table_fk0` FOREIGN KEY (`VeteranId`) REFERENCES `User`(`Id`);

ALTER TABLE `Vet/Nov Ref Table` ADD CONSTRAINT `Vet/Nov Ref Table_fk1` FOREIGN KEY (`NoviceId`) REFERENCES `User`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk0` FOREIGN KEY (`WeaponId`) REFERENCES `Weapons`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk1` FOREIGN KEY (`HeadId`) REFERENCES `Heads`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk2` FOREIGN KEY (`ArmsId`) REFERENCES `Arms`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk3` FOREIGN KEY (`ChestId`) REFERENCES `Chests`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk4` FOREIGN KEY (`WaistId`) REFERENCES `Waists`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk5` FOREIGN KEY (`LegsId`) REFERENCES `Legs`(`Id`);

ALTER TABLE `Messages` ADD CONSTRAINT `Messages_fk0` FOREIGN KEY (`ToUser`) REFERENCES `User`(`Id`);

ALTER TABLE `Messages` ADD CONSTRAINT `Messages_fk1` FOREIGN KEY (`FromUser`) REFERENCES `User`(`Id`);

