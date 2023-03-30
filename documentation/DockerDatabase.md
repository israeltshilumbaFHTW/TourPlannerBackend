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