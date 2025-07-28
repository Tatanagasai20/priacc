# Stage 1: Build the React app
FROM node:18 AS build

WORKDIR /app

# Install dependencies separately (to leverage Docker cache)
COPY package*.json ./
RUN npm install

# Now copy the rest of the code
COPY . .

# Build the app
RUN npm run build

# Stage 2: Serve the build using Nginx
FROM nginx:alpine

COPY --from=build /app/build /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
