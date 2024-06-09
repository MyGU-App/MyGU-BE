# Build jar file for execution
FROM gradle:8.7-jdk17-alpine as build

# Declare the base dir for the container
WORKDIR /app
# Copy source into /app
COPY ./ ./
# Build jar without testing
RUN gradle clean build -x test -Pdocker

# Pack application into an image
FROM openjdk:17-jdk-bullseye as production
# Declare the base dir for the container
WORKDIR /app
# Copy jar from "build" stage
COPY --from=build /app/build/libs/mygu-be-0.0.1-SNAPSHOT.jar app.jar
# Entrypoint of the container
ENTRYPOINT ["java", "-jar", "app.jar"]


