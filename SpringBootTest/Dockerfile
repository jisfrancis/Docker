FROM java:8-jdk-alpine

COPY ./target/SpringBootTest.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch SpringBootTest.jar'

ENTRYPOINT ["java","-jar","SpringBootTest.jar"]