FROM openjdk:17
EXPOSE 8080
ADD target/user-management.jar user-management.jar
ENTRYPOINT ["java","-jar","/user-management.jar"]