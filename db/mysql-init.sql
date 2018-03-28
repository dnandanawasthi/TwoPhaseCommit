create database courses;
use courses;

create table course (
   id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(30) NOT NULL,
   PRIMARY KEY (id)
);

commit;

create database universities;
use universities;


create table university (
   id BIGINT NOT NULL AUTO_INCREMENT,
   name VARCHAR(30) NOT NULL,
   PRIMARY KEY (id)
);

commit;
