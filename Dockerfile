FROM frolvlad/alpine-java:jdk11-slim

ENV TZ=Asia/Shanghai

COPY target/*.jar jenkins-docker.jar

EXPOSE 9898

VOLUME ["/opt/log"]

ENTRYPOINT ["java","-jar","jenkins-docker.jar"]