drop table if exists user;
create table user(
	id int(11) primary key auto_increment not null,
	username varchar(30),
	password varchar(100)
);
drop table if exists topic;
create table topic(
	id int(11) primary key auto_increment not null,
	message varchar(1000)
);
insert into topic(message) values("topic test!");