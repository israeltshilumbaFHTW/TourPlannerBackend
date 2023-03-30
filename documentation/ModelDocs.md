# Springboot

## Model

### Was ist ein Model


### Was ist lombok
<p>
Lombok ist eine Java-Library, mit der man Boilerplate Code reduzieren.
Das heißt, dass zum Beispiel:<br>
Getter/Setter automatisch generiert werden. Auch Constructor mit oder ohne Params können so gemacht werden 
und das nur mit wenigen Zeilen Code:
</p>

```
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
```
``@Data`` generiert *Getter/Setter* und auch *equals(), hashCode() und toString()*<br>
``@Builder`` ermöglicht es das "bauen" eines Objekts zu vereinfachen und schöner darzustellen:

```
Object object = Object.builder()
                      .attribute1(..)
                      .attribute2(..)
                      .attribute3(..)
                      .build();
```

