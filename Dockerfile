FROM openjdk:17-jdk-alpine
WORKDIR "/app"
COPY "/build/libs/practice5-interfaces.jar" "/app"
CMD java -Dserver.port=$PORT $JAVA_OPTS -jar practice5-interfaces.jar