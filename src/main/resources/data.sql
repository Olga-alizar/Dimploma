insert into category (name, description) values ('Гостинные',  'Мебель для гостинных');
insert into category (name, description) values ('Спальни',  'Мебель для спальни');
insert into category (name, description) values ('Прихожие', 'Мебель для прихожих');
insert into category (name, description) values ('Кухни', 'Мебель для кухонь');

insert into manufacturer (name, description) values ('Пинскдрев','Мебель разных категорий');
insert into manufacturer (name, description) values ('Минскмебель','');
insert into manufacturer (name, description) values ('ЗОВ','Крупный производитель кухонь');

insert into furniture (category_id, manufacturer_id, name, price, description) values (1,1,'Стенка Коста', 915, 'Цвет:    венге/прованс');
insert into furniture (category_id, manufacturer_id, name, price, description) values (1,1,'Стенка Марсель', 727, 'Цвет: венге/белый глянец');
insert into furniture (category_id, manufacturer_id, name, price, description) values (1,1,'Стенка Гамма', 915, 'Цвет: венге/дуб');
insert into furniture (category_id, manufacturer_id, name, price, description) values (2,1,'Турин', 925, 'Цвет:    венге/прованс');
insert into furniture (category_id, manufacturer_id, name, price, description) values (2,1,'Милана', 721, 'Цвет: венге/белый глянец');
insert into furniture (category_id, manufacturer_id, name, price, description) values (2,1,'Паола', 815, 'Цвет: венге/дуб');
insert into furniture (category_id, manufacturer_id, name, price, description) values (3,2,'Вирджиния', 515, 'Цвет:    венге/прованс');
insert into furniture (category_id, manufacturer_id, name, price, description) values (3,2,'Монако', 327, 'Цвет: венге/белый глянец');
insert into furniture (category_id, manufacturer_id, name, price, description) values (3,2,'Верес', 315, 'Цвет: венге/дуб');
insert into furniture (category_id, manufacturer_id, name, price, description) values (4,3,'Корнелия Экстра', 615, 'Цвет: белый/береза/марсель, прямой фасад');
insert into furniture (category_id, manufacturer_id, name, price, description) values (4,3,'Корнелия Лира', 627, 'Цвет:  зеленый/оникс/марсель, линенйный фасад, 1.8м');
insert into furniture (category_id, manufacturer_id, name, price, description) values (4,3,'Корнелия Ретро', 815, 'Цвет: ясень белый/марсель, линейный фасад');
