# Use official OpenJDK 11 as a base image
FROM openjdk:17


# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file into the container
COPY target/oswalservices-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 for the Spring Boot app
EXPOSE 10000

# Command to run the JAR file when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]
	