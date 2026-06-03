# Step 1: Use an OpenJDK image to compile and run
FROM openjdk:17-jdk-slim

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy all project files into the container
COPY . .

# Step 4: Compile the Java files from the src directory
RUN javac src/organizer/*.java -d .

# Step 5: Run the Main class (pointing to the package structure)
ENTRYPOINT ["java", "organizer.Main"]
