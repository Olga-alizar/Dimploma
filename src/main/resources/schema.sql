create table category (
    id integer not null auto_increment,
    name varchar(255),
    description varchar(255),
    primary key(id)
);
create table manufacturer (
    id integer not null auto_increment,
    name varchar(255),
    description varchar(255),
    primary key(id)
);
create table furniture (
    id integer not null auto_increment,
    category_id integer,
    manufacturer_id integer,
    name varchar(255),
    price integer,
    description varchar(255),
    primary key(id),
    FOREIGN KEY(category_id) REFERENCES category(id),
    FOREIGN KEY(manufacturer_id) REFERENCES manufacturer(id)
);

