FROM amazoncorretto:23

MAINTAINER Debojyoti Sen "deb.m.sen@gmail.com"

ADD target/*.jar ms-server.jar

EXPOSE 8081

CMD ["java","-jar","ms-server.jar"]