USE mysql;

CREATE USER 'psicocare_user'@'localhost' IDENTIFIED BY 'psicokiller';
GRANT ALL PRIVILEGES ON psicocare.* TO 'psicocare_user'@'localhost';
FLUSH PRIVILEGES;



