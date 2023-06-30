# Reactive Restful Weather-api
Simple reactive weather-api, this Reactive Weather API is a modern and scalable application built on the Spring Webflux framework, utilizing MongoDB for data storage. This version of the app is specifically designed and optimized for deployment on a Kubernetes cluster.

## Technologies used

* **Java 11**
* **Spring Boot with Spring-Webflux**: A reactive web framework for building scalable and resilient applications.
* **MongoDB**: A NoSQL database used for storing and retrieving weather data.
* **Kubernetes**: An open-source container orchestration platform that enables easy deployment, scaling, and management of containerized applications.

## Tools used
* Git 2.24.0
* IntelliJ IDEA 2021.1.1.1
* Gradle

## Dockerized Version
This project is containerized using `Docker` and is prepared for seamless deployment on `Kubernetes`. The files related to `K8s` can be found [here](/src/main/resources/)

## Docker Command to build image
* `docker build -t weather-app-docker-img .` - This will build an image with the name of `weather-app-docker-img`
