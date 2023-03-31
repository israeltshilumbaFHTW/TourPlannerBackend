# Springboot

## Entities

### Was ist eine JPA-Entity?

Ganz einfach erklärt ist ein JPA-Entity eine Klasse mit einer Tabelle aus einer Datenbank verknüpft. Sie werden mit
```@Entitiy``` gekennzeichnet. Sie benötigen immer eine ``@Id``, um den Primärschlüssel zu kennzeichner. 

### Was bedeuten die Keywords ```@SequenceGenerator``` und ```@GeneratedValue```
Sie definieren eine automatische Sequenz für den ID-key.
