create table comics (

id bigserial primary key,
title varchar(255),
author varchar(255),
creation_year int,
price numeric
);
insert into comics (title, author, creation_year, price)
values
('Hulk','Jack Kirby', 1962, 250),
('Spider-Man','Stan Lee', 1962, 350)
;


create table users (
id bigserial primary key,
name varchar(255),
age int
);
insert into users (name, age)
values
('Pavel Stepanov',20),
('Alexandr Karpov',18)
;
