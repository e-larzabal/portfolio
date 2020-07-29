CREATE DATABASE  IF NOT EXISTS `portfolio`;

CREATE USER 'portfolio_root'@'localhost' IDENTIFIED BY 'portfolio_password';
GRANT ALL PRIVILEGES ON portfolio.* TO 'portfolio_root'@'localhost';
FLUSH PRIVILEGES;

ALTER USER 'portfolio_root'@'localhost' IDENTIFIED WITH
  mysql_native_password BY 'portfolio_password';