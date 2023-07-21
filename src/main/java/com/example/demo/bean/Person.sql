-- auto Generated on 2023-02-24
-- DROP TABLE IF EXISTS person;
CREATE TABLE person(
	person_id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
	person_name VARCHAR (50) NOT NULL DEFAULT '' COMMENT '姓名',
	PRIMARY KEY (person_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'person';
