ALTER TABLE `User` DROP FOREIGN KEY `User_fk0`;

ALTER TABLE `Vet/Nov Ref Table` DROP FOREIGN KEY `Vet/Nov Ref Table_fk0`;

ALTER TABLE `Vet/Nov Ref Table` DROP FOREIGN KEY `Vet/Nov Ref Table_fk1`;

ALTER TABLE `Equipment` DROP FOREIGN KEY `Equipment_fk0`;

ALTER TABLE `Equipment` DROP FOREIGN KEY `Equipment_fk1`;

ALTER TABLE `Equipment` DROP FOREIGN KEY `Equipment_fk2`;

ALTER TABLE `Equipment` DROP FOREIGN KEY `Equipment_fk3`;

ALTER TABLE `Equipment` DROP FOREIGN KEY `Equipment_fk4`;

ALTER TABLE `Equipment` DROP FOREIGN KEY `Equipment_fk5`;

ALTER TABLE `Messages` DROP FOREIGN KEY `Messages_fk0`;

ALTER TABLE `Messages` DROP FOREIGN KEY `Messages_fk1`;

DROP TABLE IF EXISTS `User`;

DROP TABLE IF EXISTS `Vet/Nov Ref Table`;

DROP TABLE IF EXISTS `Equipment`;

DROP TABLE IF EXISTS `Messages`;

DROP TABLE IF EXISTS `Weapons`;

DROP TABLE IF EXISTS `Heads`;

DROP TABLE IF EXISTS `Chests`;

DROP TABLE IF EXISTS `Waists`;

DROP TABLE IF EXISTS `Legs`;

DROP TABLE IF EXISTS `Arms`;

