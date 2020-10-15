/* Populate tables */

CREATE DATABASE IF NOT EXISTS db_whitecollar;
USE db_whitecollar;

CREATE TABLE IF NOT EXISTS shops (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(30) NOT NULL,
  max_capacity INT NOT NULL
);


INSERT INTO shops(name, max_capacity)
VALUES('Gallery Shop', 10);

INSERT INTO shops(name, max_capacity)
VALUES('Picasso Shop', 20);

INSERT INTO shops(name, max_capacity)
VALUES('Chuli Shop', 20);

INSERT INTO shops(name, max_capacity)
VALUES('Way Shop', 20);

INSERT INTO shops(name, max_capacity)
VALUES('Fashion Shop', 20);



CREATE TABLE IF NOT EXISTS pictures (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  author_name VARCHAR(30),
  picture_name VARCHAR(30) NOT NULL,
  price INT NOT NULL,
  entry_date DATE NOT NULL,
  shop_id INT NOT NULL,
  FOREIGN KEY (shop_id) REFERENCES shops(id)
);

INSERT INTO pictures(author_name, picture_name, price, entry_date, shop_id)
VALUES('Leonardo', 'MonaLisa', 100, '2020-07-09', 1);

INSERT INTO pictures(author_name, picture_name, price, entry_date, shop_id)
VALUES('Vincent van Gogh', 'La noche estrellada', 7000, '2020-01-10', 1);

INSERT INTO pictures(author_name, picture_name, price, entry_date, shop_id)
VALUES('Gustav Klimt', 'El beso', 7000, '2020-01-10', 2);

INSERT INTO pictures(author_name, picture_name, price, entry_date, shop_id)
VALUES('Johannes Vermeer', 'La joven de la perla', 6000, '2020-02-10', 2);

INSERT INTO pictures(author_name, picture_name, price, entry_date, shop_id)
VALUES('Goya', 'La maja desnuda', 4500, '2020-02-10', 2);

INSERT INTO pictures(author_name, picture_name, price, entry_date, shop_id)
VALUES('Diego Velázquez', 'Las Meninas', 10000, '2020-02-10', 3);
