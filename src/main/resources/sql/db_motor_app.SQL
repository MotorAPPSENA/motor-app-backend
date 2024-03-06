CREATE DATABASE db_motor_app;

USE db_motor_app;

CREATE TABLE users (
    mtr_id_user int NOT NULL AUTO_INCREMENT,
    mtr_name_user varchar(100) NOT NULL,
    mtr_lastname_user varchar(100) NOT NULL,
    mtr_age_user varchar (3) NOT NULL,
    mtr_position_user varchar (100) NOT NULL,
    mtr_role_user_fk int NOT NULL,
    PRIMARY KEY(mtr_id_user)
);

CREATE TABLE roles (
mtr_id_role int NOT NULL,
mtr_name_role varchar (50) not null,
primary key(mtr_id_role)
);

CREATE TABLE customer (
mtr_id_customer int not NULL PRIMARY key,
mtr_name_customer varchar (100) not null,
mtr_lastname_customer varchar (100) not null,
mtr_age_customer varchar (3) not null,
mtr_password_customer varchar (100) not null,
mtr_email_customer varchar (100) not null,
mtr_phone_number_customer varchar (20) not null,
mtr_address_customer varchar (100) not null,
mtr_city_customer varchar (50) not null,
mtr_image_customer blob
);

CREATE TABLE transactions (
mtr_transaction_id int not null auto_increment,
mtr_product_id int not null,
mtr_customer_id int not null,
mtr_date_and_time_transaction datetime not null,
mtr_tansaction_amount decimal not null,
mtr_description_transaction varchar (250),
mtr_payment_method int not null,
mtr_peceipt_number decimal,
mtr_transaction_seller int,
mtr_transaction_status int,
primary key(mtr_transaction_id)
);

CREATE TABLE payment_method (
mtr_id_payment_method int NOT NULL,
mtr_name_payment_method varchar (50) not null,
primary key(mtr_id_payment_method)
);

CREATE TABLE transaction_status (
mtr_id_transaction_status int NOT NULL,
mtr_name_transaction_status varchar (50) not null,
primary key(mtr_id_transaction_status)
);
   
CREATE TABLE products (
mtr_product_id int auto_increment not null,
product_name varchar (250) not null,
category_product int not null,
price_product decimal not null,
quantity_in_stock int not null,
warehouse_location varchar (200),
supplier_product int,
entry_date_product date,
description_product varchar (250),
product_image blob,
technical_specifications varchar (250),
mtr_brand_id int,
primary KEY(mtr_product_id)
);

create table suppliers (
mtr_supplier_id int not null auto_increment,
mtr_supplier_name varchar (250) not null,
mtr_supplier_addrest varchar (100) not null,
mtr_city_suppliers varchar (50) not null,
mtr_country_suppliers varchar (50) not null,
mtr_phone_suppliers varchar (50) not null,
mtr_email_suppliers varchar (200) not null,
primary key (mtr_supplier_id)
);

create table mtr_categories (
mtr_category_id int not null auto_increment,
mtr_category_name varchar (100) not null,
mtr_category_description varchar (250),
mtr_category_image blob,
primary key (mtr_category_id)
);

create table car (
mtr_car_id int not null auto_increment,
mtr_customer_id_fk int not null,
mtr_creation_date_car datetime,
primary key (mtr_car_id)
);

create table cart_items (
mtr_item_id int not null auto_increment,
mtr_car_id_fk int not null,
mtr_id_product_fk int not null,
mtr_quantity_item int,
mtr_subtotal_item decimal,
mtr_status_item_fk int,
mtr_added_date datetime,
primary key (mtr_item_id)
);

create table shipping (
mtr_shipping_id int not null auto_increment,
mtr_shipping_transaction_id_fk int not null,
mtr_shipping_customer_id_fk int not null,
mtr_shipping_addrest varchar (250) not null,
mtr_shipping_date datetime,
mtr_shipping_company varchar (200) not null,
mtr_tracking_number varchar (50),
mtr_shipping_status int,
mtr_delivery_date date,
mtr_shipping_cost decimal,
mtr_shipping_notes varchar (250),
primary key (mtr_shipping_id)
);




create table status_shipping (
mtr_shipping_status_id int not null,
mtr_shipping_status varchar (50) not null,
primary key (mtr_shipping_status_id)
);

create table brands (
mtr_brand_id int not null auto_increment,
mtr_brand_name varchar (100) not null,
mtr_country_origin_brand varchar (50),
mtr_founding_year_brand varchar (4),
mtr_web_site_brand varchar (250),
mtr_description_brand varchar (250),
mtr_logo_url varchar (50),
mtr_date_added date,
primary key (mtr_brand_id)
);

ALTER TABLE users 
add constraint fk_role_user 
foreign key (mtr_role_user_fk) references roles (mtr_id_role);

ALTER TABLE  transactions
add constraint fk_payment_method 
foreign key (mtr_Payment_method) references payment_method (mtr_id_payment_method);

ALTER TABLE  transactions
add constraint fk_number_seller 
foreign key (mtr_transaction_seller) references  users (mtr_id_user);

ALTER TABLE  transactions
add constraint fk_transaction_status
foreign key (mtr_transaction_status) references  transaction_status (mtr_id_transaction_status);

ALTER TABLE  transactions
add constraint fk_id_product
foreign key (mtr_product_id) references  products (mtr_product_id);

alter table transactions
add constraint fk_id_customer
foreign key (mtr_customer_id) references customer (mtr_id_customer);
      
alter table products
add constraint fk_supplier_id
foreign key (supplier_product) references suppliers (mtr_supplier_id);

alter table products
add constraint fk_category_id
foreign key (category_product) references mtr_categories (mtr_category_id);

alter table products
add constraint fk_brands_id
foreign key (mtr_brand_id) references brands (mtr_brand_id);

alter table car
add constraint fk_customer_car_id
foreign key (mtr_car_id) references customer (mtr_id_customer);

alter table cart_items
add constraint fk_car_id
foreign key (mtr_car_id_fk) references car (mtr_car_id);

alter table cart_items
add constraint fk_id_product_car
foreign key (mtr_id_product_fk) references products (mtr_product_id);

alter table cart_items
add constraint fk_status_item
foreign key (mtr_status_item_fk) references transaction_status (mtr_id_transaction_status);

alter table shipping
add constraint fk_shipping_transaction_id
foreign key (mtr_shipping_transaction_id_fk) references transactions (mtr_transaction_id);

alter table shipping
add constraint fk_shipping_customer_id
foreign key (mtr_shipping_customer_id_fk) references customer (mtr_id_customer);

alter table shipping
add constraint fk_shipping_status_id
foreign key (mtr_shipping_status) references status_shipping (mtr_shipping_status_id);
  
commit;

use db_motor_app;
ALTER TABLE suppliers RENAME COLUMN mtr_city_addrest TO mtr_city_suppliers;
ALTER TABLE suppliers RENAME COLUMN mtr_country_addrest TO mtr_country_suppliers;
ALTER TABLE suppliers RENAME COLUMN mtr_phone_addrest TO mtr_phone_suppliers;
ALTER TABLE suppliers RENAME COLUMN mtr_email_addrest TO mtr_email_suppliers;