create table categories (
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
    categories_id integer,
    manufacturer_id integer,
    name varchar(255),
    price integer,
    description varchar(255),
    primary key(id),
    FOREIGN KEY(categories_id) REFERENCES categories(id),
    FOREIGN KEY(manufacturer_id) REFERENCES manufacturer(id)
);

