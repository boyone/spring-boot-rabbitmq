# README

## Start RabbitMQ

```shell script
docker container run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3
.8.4-management-alpine
```

### Access RabbitMQ via web browser

```http request

```

## Package

```shell script
./mvnw clean package
```

## Start Receiver/Receiver2

```shell script
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,receiver
```

```shell script
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world
,receiver2
```

## Start Sender

```shell script
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world
,sender
``` 