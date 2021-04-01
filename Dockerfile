FROM maven:3.5.0-jdk-8-alpine AS builder
#WORKDIR /devhaus/src/app
ADD ./pom.xml pom.xml
ADD ./src src/

RUN mvn clean package

From openjdk:8-jre-alpine

# copy jar from the first stage
COPY --from=builder target/assignment-1.0-SNAPSHOT.jar assignment-1.0-SNAPSHOT.jar

EXPOSE 8080

#CMD ["java", "-jar", "assignment-1.0-SNAPSHOT.jar"]
CMD java -jar assignment-1.0-SNAPSHOT.jar; sleep 60