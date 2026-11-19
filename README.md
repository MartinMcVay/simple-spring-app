I am a README file version 2.

## Simple Spring App

A minimal Spring Boot web application.

### Stack

- Java 21
- Spring Boot 4.1.2
- Maven (wrapper included)

### Endpoints

| Method | Path             | Description                                  |
| ------ | ---------------- | -------------------------------------------- |
| GET    | `/`              | Greeting payload for "World"                 |
| GET    | `/greeting`      | Greeting payload, optional `?name=` param    |
| GET    | `/actuator/health` | Liveness/readiness health status           |

Example:

```
$ curl "http://localhost:8080/greeting?name=Spring"
{"message":"Hello, Spring!","timestamp":"2026-11-19T17:09:50.790Z"}
```

### Build and run

```bash
./mvnw clean test       # run the tests
./mvnw spring-boot:run  # start the app on http://localhost:8080
./mvnw clean package    # build target/simple-spring-app-0.0.1-SNAPSHOT.jar
```

### Project layout

```
src/main/java/com/example/simplespringapp/
├── SimpleSpringApplication.java   # application entry point
└── web/GreetingController.java    # REST controller
src/main/resources/
└── application.properties         # app name, port, actuator exposure
src/test/java/com/example/simplespringapp/
├── SimpleSpringApplicationTests.java   # context load test
└── web/GreetingControllerTests.java    # MockMvc endpoint tests
```
