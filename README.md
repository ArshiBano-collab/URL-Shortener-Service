# URL Shortener Service

This project is a simple URL shortening service built using Spring Boot and MySQL. The idea behind this project is similar to services like Bitly or TinyURL. The application takes a long URL as input, generates a short unique code for it, and stores the mapping in a MySQL database. Whenever the short URL is opened, the server retrieves the original URL from the database and redirects the user to that website.

Through this project, I learned how backend services handle URL redirection, REST APIs, and database integration using Spring Boot.

## Features

- Generate short URLs from long links  
- Redirect users from short URL to the original website  
- Store URL mappings in MySQL database  
- Track the number of times a short link is clicked  
- REST API based backend built with Spring Boot  

## Tech Stack

- Java  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Maven  

## Project Structure

The project follows a layered backend architecture:

Client (Postman / Browser)  
↓  
Controller – Handles API requests  
↓  
Service – Contains business logic  
↓  
Repository – Handles database operations  
↓  
MySQL Database  

## API Endpoints

Create Short URL  

POST request  

Example:  
http://localhost:8080/api/shorten?url=https://youtube.com  

Example Response:  
Short URL: http://localhost:8080/api/r/LvKHNQ  

Redirect to Original URL  

Open the generated short URL in the browser:  

http://localhost:8080/api/r/LvKHNQ  

The server retrieves the original URL from the database and redirects the user to that website.

## Database Table

The application stores URL mappings in a table with the following fields:

- id  
- original_url  
- short_code  
- click_count  

## What I Learned

While building this project I learned how to create REST APIs using Spring Boot, how to connect a Spring Boot application with MySQL, how to structure backend applications using Controller, Service, and Repository layers, and how URL redirection works in web applications.

