FROM openjdk:11
ADD target/proyecto-spring-boot.jar proyecto-spring-boot.jar
ENTRYPOINT ["java", "-jar","proyecto-spring-boot.jar"]
