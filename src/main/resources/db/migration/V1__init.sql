create table comics (

id bigserial primary key,
title varchar(255),
author varchar(255),
creation_year int,
price double

);
insert into comics (title, author, creation_year, price)
values
('Hulk','Jack Kirby', 1962, 250),
('Spider-Man','Stan Lee', 1962, 350);