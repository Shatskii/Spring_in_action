DROP TABLE IF EXISTS Taco;
DROP TABLE IF EXISTS Ingredient_Ref;
DROP TABLE IF EXISTS Ingredient;
DROP TABLE IF EXISTS Taco_Order;

create table Taco_Order (
    id serial PRIMARY KEY ,
    delivery_Name varchar not null,
    delivery_Street varchar not null,
    delivery_City varchar not null,
    delivery_State varchar not null,
    delivery_Zip varchar not null,
    cc_number varchar not null,
    cc_expiration varchar not null,
    cc_cvv varchar not null,
    placed_at timestamp not null);

create table Taco (
    id serial,
    name varchar not null,
    taco_order bigint not null,
    taco_order_key bigint not null,
    created_at timestamp not null
    );

create table Ingredient_Ref (
    ingredient varchar not null,
    taco int not null,
    taco_key int not null
    );

create table Ingredient (
    id varchar PRIMARY KEY ,
    name varchar not null,
    type varchar not null
    );

alter table Taco
    add foreign key (taco_order) references Taco_Order(id);
alter table Ingredient_Ref
    add foreign key (ingredient) references Ingredient(id);

SELECT * FROM Ingredient;
SELECT * FROM Taco;
SELECT * FROM Ingredient_Ref;
SELECT * FROM Taco_Order