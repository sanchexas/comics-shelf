create table genre (
id bigserial primary key,
title varchar(255)
);
insert into genre (title)
values
('Horror'),
('Fantasy'),
('Detective'),
('Science fiction'),
('Thriller'),
('Romance')
;