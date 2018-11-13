CREATE TABLE `User` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `UserName` varchar(20) NOT NULL UNIQUE,
  `Password` varchar(30) NOT NULL,
  `Rank` varchar(15) NOT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `Vet/Nov Ref Table` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `VeteranId` INT NOT NULL,
  `NoviceId` INT NOT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `Equipment` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `UserId` INT NOT NULL UNIQUE,
  `WeaponId` INT,
  `HeadId` INT,
  `ArmsId` INT,
  `ChestId` INT,
  `WaistId` INT,
  `LegsId` INT,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `Messages` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `ToUser` INT NOT NULL,
  `FromUser` INT NOT NULL,
  `Message` varchar(140) NOT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `Weapons` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `Heads` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `Chests` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `Waists` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `Legs` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `Arms` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `Roles` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `RoleName` varchar(15) NOT NULL,
  PRIMARY KEY (`Id`)
);

CREATE TABLE `User_Roles` (
  `UserId` INT NOT NULL,
  `RoleId` INT NOT NULL,
  PRIMARY KEY (`UserId`,`RoleId`)
);

ALTER TABLE `Vet/Nov Ref Table` ADD CONSTRAINT `Vet/Nov Ref Table_fk0` FOREIGN KEY (`VeteranId`) REFERENCES `User`(`Id`);

ALTER TABLE `Vet/Nov Ref Table` ADD CONSTRAINT `Vet/Nov Ref Table_fk1` FOREIGN KEY (`NoviceId`) REFERENCES `User`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk0` FOREIGN KEY (`UserId`) REFERENCES `User`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk1` FOREIGN KEY (`WeaponId`) REFERENCES `Weapons`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk2` FOREIGN KEY (`HeadId`) REFERENCES `Heads`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk3` FOREIGN KEY (`ArmsId`) REFERENCES `Arms`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk4` FOREIGN KEY (`ChestId`) REFERENCES `Chests`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk5` FOREIGN KEY (`WaistId`) REFERENCES `Waists`(`Id`);

ALTER TABLE `Equipment` ADD CONSTRAINT `Equipment_fk6` FOREIGN KEY (`LegsId`) REFERENCES `Legs`(`Id`);

ALTER TABLE `Messages` ADD CONSTRAINT `Messages_fk0` FOREIGN KEY (`ToUser`) REFERENCES `User`(`Id`);

ALTER TABLE `Messages` ADD CONSTRAINT `Messages_fk1` FOREIGN KEY (`FromUser`) REFERENCES `User`(`Id`);

ALTER TABLE `User_Roles` ADD CONSTRAINT `User_Roles_fk0` FOREIGN KEY (`UserId`) REFERENCES `User`(`Id`);

ALTER TABLE `User_Roles` ADD CONSTRAINT `User_Roles_fk1` FOREIGN KEY (`RoleId`) REFERENCES `Roles`(`Id`);
