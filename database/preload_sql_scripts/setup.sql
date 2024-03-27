CREATE DATABASE wiss_db;
USE wiss_db;
CREATE USER wiss_user IDENTIFIED BY "secretpw";
GRANT ALL ON wiss_db.* TO wiss_user;
