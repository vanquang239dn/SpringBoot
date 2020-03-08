DROP TABLE IF EXISTS CAR;

CREATE TABLE CAR (
  id int(5) NOT NULL AUTO_INCREMENT,
  make varchar(20) NOT NULL,
  model varchar(20) NOT NULL, 
  comment varchar(20) NOT NULL,
  PRIMARY KEY (id)
);
