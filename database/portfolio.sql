
# create database
CREATE DATABASE  IF NOT EXISTS `portfolio`;

# create the root user
CREATE USER 'portfolio_root'@'localhost' IDENTIFIED BY 'portfolio_password';
GRANT ALL PRIVILEGES ON portfolio.* TO 'portfolio_root'@'localhost';
FLUSH PRIVILEGES;

# to fix error message : Unable to load authentication plugin 'caching_sha2_password'. Unable to load authentication plugin 'caching_sha2_password'.
# and create connection with DBeaver
ALTER USER 'portfolio_root'@'localhost' IDENTIFIED WITH
  mysql_native_password BY 'portfolio_password';