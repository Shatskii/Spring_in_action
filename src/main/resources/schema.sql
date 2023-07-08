DROP TABLE IF EXISTS Taco;
DROP TABLE IF EXISTS Ingredient_Ref;
DROP TABLE IF EXISTS Ingredient;
DROP TABLE IF EXISTS Taco_Order;
create table Taco_Order
(
    id              serial PRIMARY KEY,
    delivery_Name   varchar   not null,
    delivery_Street varchar   not null,
    delivery_City   varchar   not null,
    delivery_State  varchar   not null,
    delivery_Zip    varchar   not null,
    cc_number       varchar   not null,
    cc_expiration   varchar   not null,
    cc_cvv          varchar   not null,
    placed_at       timestamp not null
);

create table Taco
(
    id             serial primary key,
    name           varchar   not null,
    taco_order     bigint references Taco_Order (id),
    created_at     timestamp not null
);

create table Ingredient
(
    id   varchar PRIMARY KEY,
    name varchar not null,
    type varchar not null
);

create table Ingredient_Ref
(
    taco_id       int references Taco (id),
    ingredient_id varchar references Ingredient (id),
    primary key (taco_id, ingredient_id)
);

SELECT *
FROM Ingredient;
SELECT *
FROM Taco;
SELECT *
FROM Ingredient_Ref;
SELECT *
FROM Taco_Order;

drop table Ingredient cascade;
drop table Taco cascade;
drop table Ingredient_Ref cascade;
drop table Taco_Order cascade;