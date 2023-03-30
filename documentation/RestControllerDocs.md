# SpringBoot 

## Was ist Tomcat
<p>
Tomcat ist ein Java HTTP-WebServer. Um zum Beispiel port zu ändern, muss man:
<br> application.yml:

```yaml
server:
  port: 3000
```
Default Port ist *8080*
</p>

## Rest Controller 

### Was ist ein Controller?
<p>
Ein Controller ist eine Komponente, die sich um eingehende HTTP-Requests kümmert 
und denen eine passende Antwort zurückgibt
</p>

### Wie implementiert man eine `` @RestController``Klasse

Füge
``@RestController``
in die Klasse ein, die das managed. 
Optional kann man auch das Keyword:

``@RequestMapping("/example")`` verwenden.

Das heißt dann nur, dass wenn man einen Request macht, diese auf den Pfad ``localhost:8080/example/hello`` gehen müsste

dann über jeder Funktion, die einen Pfad behandelt
<p>

``@GetMapping("/path")``
``@PostMapping("/path")``
...
</p>
abhängig vom Request Type


**Test** Hello World function:
```
@GetMapping("/hello")
public String greet() {
    return "Hello World\n";
}
```
```sh
#!/bin/bash
curl http://localhost:8080/testService/hello
```

Result sollte *Hello World* sein

<p>
Will Man aber ein JSON und nicht einen String als Response haben:
</p>

```

@GetMapping("/helloJson")
public GreetingJsonResponse greetJson() {
    return new GreetingJsonResponse("Hello World");
}
record GreetingJsonResponse(String greetings){}
```
Das Keyword ```record ```ermöglicht uns die Klasse ```GreetingJsonResponse(...)``` zur Datenlagerung zu verwenden, 
ohne sie implementiert zu haben.
Der String ```greetings``` wird im Json als Key übernommen.

```sh
#!/bin/bash
curl http://localhost:8080/testService/helloJson
```

Result sollte *{"greetings":"Hello World"}* sein
