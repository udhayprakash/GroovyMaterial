# Use the official gradle image as a base image
FROM gradle:jdk11

# Install Groovy
RUN apt-get update && apt-get install -y groovy

# Set the work directory
WORKDIR /workspace
