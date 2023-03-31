# Springboot

## Database Connection:

### Database Settings:
In einem docker-compose.yml file folgende Konfiguration:
```yaml
services:
  db:
    container_name: postgres
    image: postgres
    environment:
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: pw123456
    ports:
      - "5432:5432"
    restart: unless-stopped
```
Um es zu starten dann:
```shell
#!/bin/bash
echo -e "Starting Database\n"
sudo docker compose up -d
```
To get Database logs:
```shell
#!/bin/bash
sudo docker logs postgres -f
```

## JDBC

### Was ist postgres JDBC

<p>
pgJDBC ermöglicht uns in Java Code eine Verbindung zur Datenbank herzustellen und damit 
CRUD-Operationen durchzufüren
</p>

Um es hinzuzufügen im *pom.xml* file unter ``<dependencies>``:
```
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
</dependency>
```

Nun muss das *application.yml* file angepasst werden, damit es sich mit der DB verbinden kann.

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/tour_planner
    username: postgres
    password: pw123456
  jpa:
    hibernate:
      ddl-auto: create-drop #drops tables when DB is terminated
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        format_sql: true
      show-sql: true #shows sql code
  main:
    web-application-type: servlet
```

Wenn man den Server startet, kommt es zu einem Error, da es die DB *tour_planner* nicht gibt.
Um sie zu erstellen:

```shell
#!/bin/bash
docker exec -it postgres bash
psql -U postgres #-U means user
\l #is going to list DB

CREATE DATABASE tour_planner;
```
