# Spring Boot Kafka Producer-Consumer

## Overview

This project demonstrates asynchronous communication between two Spring Boot microservices using Apache Kafka.

The producer publishes order details to a Kafka topic, and the consumer receives and processes them in real time.

## Tech Stack

- Java 17
- Spring Boot
- Apache Kafka
- Spring Kafka
- Maven
- REST API

## Architecture

```
Client
   │
   ▼
Producer (Spring Boot)
   │
   ▼
Kafka Topic (orders)
   │
   ▼
Consumer (Spring Boot)
```

## Project Structure

```
springboot-kafka-producer-consumer
│
├── producer
├── consumer
└── README.md
```

## Steps to Run

### 1. Start Zookeeper

```bash
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
```

### 2. Start Kafka Broker 1

```bash
bin\windows\kafka-server-start.bat config\server.properties
```

### 3. Start Kafka Broker 2

```bash
bin\windows\kafka-server-start.bat config\server-2.properties
```

### 4. Create Topic

```bash
bin\windows\kafka-topics.bat --create --topic orders --bootstrap-server localhost:9092 --partitions 3 --replication-factor 2
```

### 5. Run Producer

Run the Producer Spring Boot application.

### 6. Run Consumer

Run the Consumer Spring Boot application.

## Test API

### Producer

```
POST http://localhost:8081/kafka/add-order
```

Request Body

```json
{
  "orderID": 101,
  "customerName": "Keerthana",
  "productName": "Laptop",
  "price": 65000,
  "address": "Bengaluru"
}
```

### Consumer

```
GET http://localhost:8082/kafka/get-order
```

## Features

- Kafka Producer
- Kafka Consumer
- Multi Broker Setup
- Topic Partitions
- Replication
- Event Driven Architecture
- REST APIs

## Future Improvements

- Docker
- Kubernetes
- Dead Letter Queue
- Kafka Streams
