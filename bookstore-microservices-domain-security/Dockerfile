FROM openjdk:12-alpine

MAINTAINER kicey

ENV SPRING_OUTPUT_ANSI_ENABLED=ALWAYS \
    JAVA_OPTS="" \
    PORT=8301 \
    CONFIG_PORT=8888 \
    PROFILES="default"

ADD /target/*.jar /bookstore-security.jar

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /bookstore-security.jar --spring.profiles.active=$PROFILES"]

EXPOSE $PORT
