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

CREATE TABLE item
(
    itemID   varchar(7)  not null,
    itemName varchar(30) not null,
    itemQty varchar(100) not null,
    CONSTRAINT PRIMARY KEY (itemID)
);

