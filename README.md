# Reactive Restful Weather-api
Simple reactive weather-api, build on Spring Webflux with MongoDB. This version of the app is ready to deploy on the Kubernetes cluster.

# Libraries used

* Spring Boot with Spring-Webflux
* Reactive Mongo Repository(Spring Data)
* MongoDB
* Java 11

# Tools used
* Git 2.24.0
* IntelliJ IDEA 2021.1.1.1
* Gradle

# Dockerized Version
This project is Dockernized and ready to deploy on `Kubernetes.` The files related to `K8s` can be found [here](/src/main/resources/)
# Docker Command to build image
* `docker build -t weather-app-docker-img .` - This will build an image with the name of `weather-app-docker-img`
