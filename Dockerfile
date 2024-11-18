# Use an official JDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the application's jar file to the container
COPY /target/*.jar /app.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the jar file
# Run the web service on container startup.
CMD ["sh", "-c", "java -jar /app.jar"]

