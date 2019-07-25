FROM openjdk:8
RUN mkdir /config
ADD target/kube-secret-*.jar /app.jar
ADD src/main/resources/application.properties /config/application.properties
WORKDIR /
ENTRYPOINT java -jar ./app.jar
