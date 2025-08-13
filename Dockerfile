# 1️⃣ Use OpenJDK 17 as base image
FROM eclipse-temurin:17-jdk

# 2️⃣ Set app directory inside the container
WORKDIR /app

# 3️⃣ Copy the JAR file from local target/ to container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# 4️⃣ Set environment variables (optional)
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://aws-1-ap-south-1.pooler.supabase.com:5432/postgres?user=postgres.iqrutswvdshgiweamckn&password=DemoProject@123
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=DemoProject@123

# 5️⃣ Command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]