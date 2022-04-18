CREATE TABLE if not exists Product (
ID int not null,
name  VARCHAR(10) not null,
description VARCHAR(20) not null,
price float not null,
pictureUrl VARCHAR(20) not null,
productCategory VARCHAR(10) not null
);