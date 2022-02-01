FROM openjdk:8
ADD target/funds.jar funds.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","funds.jar"]