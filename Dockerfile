#-------------------------
#1. Specify From Start with jdk image
# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

#3.Add jar of this project folder
# Copy the local .jar file to the container's app directory

COPY target/HemanthResumeService-0.0.1-SNAPSHOT.jar app.jar


#2. Expose the port - Making port availeble outside the container
# Expose the port the app will run on
EXPOSE 8080

#4. Add EntryPoint to the app which is .jar file
# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
