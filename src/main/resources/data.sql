insert into categories (name, description) values ('Гостинные',  'Мебель для гостинных');
insert into categories (name, description) values ('Спальни',  'Мебель для спальни');
insert into categories (name, description) values ('Прихожие', 'Мебель для прихожих');
insert into categories (name, description) values ('Кухни', 'Мебель для кухонь');

insert into manufacturer (name) values ('Пинскдрев');
insert into manufacturer (name) values ('Минскмебель');
insert into manufacturer (name) values ('ЗОВ');

insert into furniture (categories_id, manufacturer_id, name, price, description) values (1,1,'Стенка Коста', 915, 'Цвет:    венге/прованс');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (1,1,'Стенка Марсель', 727, 'Цвет: венге/белый глянец');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (1,1,'Стенка Гамма', 915, 'Цвет: венге/дуб');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (2,1,'Турин', 925, 'Цвет:    венге/прованс');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (2,1,'Милана', 721, 'Цвет: венге/белый глянец');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (2,1,'Паола', 815, 'Цвет: венге/дуб');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (3,2,'Вирджиния', 515, 'Цвет:    венге/прованс');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (3,2,'Монако', 327, 'Цвет: венге/белый глянец');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (3,2,'Верес', 315, 'Цвет: венге/дуб');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (4,3,'Корнелия Экстра', 615, 'Цвет: белый/береза/марсель, прямой фасад');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (4,3,'Корнелия Лира', 627, 'Цвет:  зеленый/оникс/марсель, линенйный фасад, 1.8м');
insert into furniture (categories_id, manufacturer_id, name, price, description) values (4,3,'Корнелия Ретро', 815, 'Цвет: ясень белый/марсель, линейный фасад');
