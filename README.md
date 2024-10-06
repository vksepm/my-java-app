# Java API Service Starter

This is a minimal Java API service starter based on [Google Cloud Run Quickstart](https://cloud.google.com/run/docs/quickstarts/build-and-deploy/deploy-java-service).

## Getting Started

Server should run automatically when starting a workspace. To run manually, run:
```sh
mvn spring-boot:run
```
## Run Active MQ Broker 

```sh
docker run -d --name activemq -p 61616:61616 -p 8161:8161 rmohr/activemq:5.15.9
```
Web UI can be accessed from port 8161


## Run alternative Active MQ Broker artemis

```sh
docker run --detach --name activemq -p 61616:61616 -p 8161:8161 --rm apache/activemq-artemis:latest-alpine
```
Credentials: artemis

