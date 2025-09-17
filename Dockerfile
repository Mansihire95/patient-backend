# Use Java 17 image (or the version your project uses)
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy built jar file into container
COPY target/*.jar app.jar

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
