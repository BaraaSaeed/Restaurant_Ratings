CREATE TABLE `Restaurants` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `rating` double(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

INSERT INTO `Restaurants` (name, rating)
VALUES ('MCDonald', 3);
INSERT INTO `Restaurants` (name, rating)
VALUES ('KFC', 4);
INSERT INTO `Restaurants` (name, rating)
VALUES ('Dominos Pizza', 5);
INSERT INTO `Restaurants` (name, rating)
VALUES ('Ishtar - Sterling Heights', 5);

