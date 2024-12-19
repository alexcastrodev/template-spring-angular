FROM eclipse-temurin:21-jdk as base

WORKDIR /app

# Install Node.js 22
RUN apt-get update && \
    apt-get install -y curl && \
    curl -fsSL https://deb.nodesource.com/setup_22.x | bash - && \
    apt-get install -y nodejs && \
    node -v && npm -v

COPY . .

RUN cd webapp && \
    npm install && \
    npm run build:production && \
    cd ..

RUN ./gradlew build

EXPOSE 8080

CMD [ "java", "-jar", "build/libs/example-0.0.1-SNAPSHOT.jar" ]