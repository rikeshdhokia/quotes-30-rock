FROM jolokia/alpine-jre-8
COPY target/quotes-30-rock-0.1.0-SNAPSHOT-standalone.jar /app.jar
CMD ["java", "-jar", "/app.jar"]