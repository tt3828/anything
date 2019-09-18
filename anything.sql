create table band
(
    band_id serial primary key,
    band_name varchar
);


create table item_status
(
    status_id int primary key,
    status varchar
);



create table member_position
(
position_id serial,
position_name varchar,
primary key (position_id)
);





Create table band_role (
role_id int,
role_name varchar,
primary key (role_id)
);


Create table user_status (
user_status_id int,
user_status varchar,
	primary key (user_status_id)
);

create table app_users 
(
    user_id serial primary key,
    email varchar unique,
    password varchar,
    user_status_id int, 
    band_id serial,
    foreign key (band_id) references band (band_id),
    foreign key (user_status_id) references user_status (user_status_id)

);

Create table app_album (
album_id serial,
album_name varchar,
status_id int,
release_date date,
primary key (album_id),
	foreign key (status_id) references item_status (status_id)
);

Create table songs (
song_id serial,
song_name varchar,
band_id serial,
album_id serial,
release_date date,
song_location varchar,
	primary key(song_id),
	Foreign key (band_id) references band (band_id),
	Foreign key (album_id) references app_album (album_id)
);


create table band_member
(
    user_id serial,
    band_id serial,
    role_id int,
    position_id int,
    foreign key (user_id) references app_users (user_id),	
    foreign key (band_id) references band (band_id),
    foreign key (role_id) references band_role (role_id),
    foreign key (position_id) references member_position (position_id)
);

--item_status
insert into item_status values (1, 'Created');
insert into item_status values (2, 'Pending');
insert into item_status values (3, 'Completed');
insert into item_status values (4, 'Available');

--member_position
insert into member_position values (1, 'Producer');
insert into member_position values (2, 'Vocalist');
insert into member_position values (3, 'Guitarist');
insert into member_position values (4, 'Drummer');
insert into member_position values (5, 'Bassist');
insert into member_position values (6, 'Pianist');
insert into member_position values (7, 'Composer');
insert into member_position values (8, 'Violinist');
insert into member_position values (9, 'Masterer');
insert into member_position values (10, 'Mixer');
insert into member_position values (11, 'Executive Producer');
insert into member_position values (12, 'DJ');

--band_role
insert into band_role values (1, 'admin');
insert into band_role values (2, 'user');

--user_status
insert into user_status values (1, 'active');
insert into user_status values (2, 'inactive');