create database gisa;
 use gisa;
 create table gisa(
	std_no integer primary key,
    email varchar(20)not null,
    kor integer not null,
    eng integer not null,
    math integer not null,
    sci integer not null,
    hist integer not null,
    total integer not null,
    mrg_sample37code char(1) not null,
    acc_code char(1) not null,
    local_code char(1) not null);
 select *from gisa;
 -- 990001,addx, 17, 29, 16, 49, 43154,C,A,C
 insert into gisa value(990002,'addx', 17, 29, 16, 49, 43154,'C','A','C');