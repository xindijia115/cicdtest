FROM openjdk:11-jdk

ENV TZ=Asia/Shanghai

COPY target/*.jar jenkins-docker.jar

EXPOSE 9898

VOLUME ["/opt/log"]

ENTRYPOINT ["java","-jar","jenkins-docker.jar"]