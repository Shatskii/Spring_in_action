DROP TABLE IF EXISTS Taco;
DROP TABLE IF EXISTS Ingredient_Ref;
DROP TABLE IF EXISTS Ingredient;
DROP TABLE IF EXISTS Taco_Order;
--------------------------------------------------
create table Taco_Order
(
    id              serial PRIMARY KEY,
    delivery_Name   varchar not null,
    delivery_Street varchar not null,
    delivery_City   varchar not null,
    delivery_State  varchar not null,
    delivery_Zip    varchar not null,
    cc_number       varchar not null,
    cc_expiration   varchar not null,
    cc_cvv          varchar not null,
    placed_at       date    not null
);

create table Taco
(
    id         serial primary key,
    name       varchar not null,
    taco_order bigint references Taco_Order (id),
    created_at date    not null
);

create table Ingredient
(
    id   text PRIMARY KEY,
    name text not null,
    type text not null
);

create table Ingredient_Ref
(
    taco_id       int references Taco (id),
    ingredient_id varchar references Ingredient (id),
    primary key (taco_id, ingredient_id)
);
---------------------------------------
SELECT *
FROM ingredient;
SELECT *
FROM taco;
SELECT *
FROM ingredient_ref;
SELECT *
FROM taco_order;
---------------------------------------
drop table Ingredient cascade;
drop table Taco cascade;
drop table Ingredient_Ref cascade;
drop table Taco_Order cascade;
Truncate table ingredient cascade;
--------------------------------------
create table users
(
    id           serial PRIMARY KEY,
    user_name    varchar not null,
    password     varchar not null,
    full_name    varchar not null,
    street       varchar not null,
    city         varchar not null,
    state        varchar not null,
    zip          varchar not null,
    phone_number varchar not null
);

create table roles
(
    id   serial primary key,
    name varchar not null
);

create table users_roles
(
    user_id  int references users (id),
    role_id int references roles (id),
    primary key (user_id, role_id)
);
---------------------------------------------
drop table roles cascade;
drop table users cascade;
drop table users_roles cascade;
---------------------------------------------
select *
 from roles;
select *
from users_roles;
select *
from users;
-------------
truncate table users cascade ;
--------------------------------------------------