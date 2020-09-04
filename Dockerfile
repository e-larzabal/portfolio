FROM tomcat:jdk11-openjdk-slim-buster

RUN apt-get update \
  && apt-get install -y mysql-server \
  && rm -rf /var/lib/apt/lists/* \
  apt-get clean


EXPOSE 3306 8080

COPY ./target/ /usr/local/portfolio/target/


