DROP
DATABASE IF EXISTS CustomerItemDB;
CREATE
DATABASE IF NOT EXISTS CustomerItemDB;
use CustomerItemDB;

CREATE TABLE customer
(
    customerID   varchar(7)  not null,
    customerName varchar(30) not null,
    customerAddress varchar(100) not null,
    customerMobile   int(10),
    CONSTRAINT PRIMARY KEY (customerID)
);

