# Use the official Node.js image as the base image
FROM node:22-alpine

# Set the working directory inside the container
WORKDIR /app

# node-gyp
RUN apk add --no-cache \
    python3 \
    py3-pip \
    build-base \
    make \
    g++ \
    && ln -sf python3 /usr/bin/python

# Copy the rest of the application source code
COPY . .

# Expose Angular's development server port
EXPOSE 4200

RUN chmod +x startup

# Let container opened
CMD ["tail", "-f", "/dev/null"]
