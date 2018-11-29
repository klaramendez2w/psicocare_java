CREATE SCHEMA `employees` ;

USE mysql;

CREATE USER 'psicocare_user'@'localhost' IDENTIFIED BY 'psicokiller';
GRANT ALL PRIVILEGES ON psicocare_user.* TO 'psicocare_user'@'localhost';
FLUSH PRIVILEGES;



