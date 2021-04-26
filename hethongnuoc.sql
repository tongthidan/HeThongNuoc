
CREATE TABLE Account (ID int(10) NOT NULL AUTO_INCREMENT, UserId int(10) NOT NULL, Username varchar(255), Password varchar(255), PRIMARY KEY (ID));
CREATE TABLE `User` (Id int(10) NOT NULL AUTO_INCREMENT, `Family IdFamily` int(10) NOT NULL, Acc int(10), FullName varchar(255), Gmail varchar(255), SDT varchar(255), Address varchar(255), Role int(10), PRIMARY KEY (Id));
CREATE TABLE Taxes (IdTaxes int(10) NOT NULL AUTO_INCREMENT, NameTaxes varchar(255), Retrict varchar(255), TypeTaxes varchar(255), PRIMARY KEY (IdTaxes));
CREATE TABLE Bill (ID2 int(10) NOT NULL AUTO_INCREMENT, `Family IdFamily` int(10) NOT NULL, TaxesIdTaxes int(10) NOT NULL, Id int(10) NOT NULL, Total float NOT NULL, MonthUse int(10) NOT NULL, Status varchar(255), SoNuoc int(10) NOT NULL, PRIMARY KEY (ID2));
CREATE TABLE MoneyUnit (ID int(10) NOT NULL AUTO_INCREMENT, BillID2 int(10) NOT NULL, Name varchar(255), Dinhmuc varchar(255), MoneyUnit varchar(255), PRIMARY KEY (ID));
CREATE TABLE Family (IdFamily int(10) NOT NULL AUTO_INCREMENT, NameFamily varchar(255), IdUser int(10) NOT NULL, `Date` date, HinhThucTT varchar(255), PRIMARY KEY (IdFamily));
ALTER TABLE Account ADD CONSTRAINT FKAccount182229 FOREIGN KEY (UserId) REFERENCES `User` (Id);
ALTER TABLE Bill ADD CONSTRAINT FKBill263199 FOREIGN KEY (TaxesIdTaxes) REFERENCES Taxes (IdTaxes);
ALTER TABLE MoneyUnit ADD CONSTRAINT FKMoneyUnit403785 FOREIGN KEY (BillID2) REFERENCES Bill (ID2);
ALTER TABLE `User` ADD CONSTRAINT FKUser593760 FOREIGN KEY (`Family IdFamily`) REFERENCES `Family ` (IdFamily);
ALTER TABLE Bill ADD CONSTRAINT FKBill18332 FOREIGN KEY (`Family IdFamily`) REFERENCES `Family ` (IdFamily);
