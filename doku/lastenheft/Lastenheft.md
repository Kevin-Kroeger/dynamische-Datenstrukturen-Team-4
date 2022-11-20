# Lastenheft Team 4

**Entwicklung eines Wer wird Millionär Programmes**

| Stand        | 13.11.2022                                                  |
|--------------|-------------------------------------------------------------|
| Auftraggeber | Hermann-Emanuel-Berufskolleg Informatik LK Abschlussprojekt |

# Inhaltsverzeichnis
1. [Einleitung](#1-einleitung)
2. [Soll-Konzept](#2-soll-konzept)
3. [Anforderungen](#3-anforderungen)
4. [Entwürfe](#4-entwrfe)


## 1 Einleitung
* Aufg *



## 2 Soll-Konzept

### 2.1 Anwendungsbreiche

Die Anwendung soll eine Funktionierende Kopie des Deutschland weit bekannten Game-Show "Wer wird Millionär" sein.
Diese Kopie soll Spielbar sein und mithilfe dynamischen Datenstrukturen Erweitert werden. 3 Verschiedene Spiel-modys 
sollen in unserer Version von "Wer wird Millionär" vorhanden sein. Diese Unterscheiden sich je nach Datenstruktur in 
ihrer Anwendung. So werden die Modys "Klassisch", "Überleben" und "Jeopardy" spielbar sein. Alle Fortschritte werden
in einen Leaderboard gespeichtert. Somit soll an Ende des Projektes ein Witziges und Spannendes Spiel rauskommen. 
### 2.2 Systemidee

Die Grundidee unsers Projekts ist die Kultische und schon fast Legendäre Game-show "Wer wird Millinär". Diese wird mit 
Dynamischen Datenstrukturen aufgewertet. Diese sollen die Spielspaß auf ein neues Level heben. 
### 2.3 Ziele

#### 2.3.1 Ziele des  Projektes
Dieses Projekt soll das ganze können des Team unter Beweis stellen. Hierzu wollen wir das Wissen der letzt 1,5 Jahre auf 
Zusammenfassen. Neu dazu kommen Dynamische Datenstrukturen und Genreics. Durch dieses Projekt wolle wir uns bests möglich 
auf die anstehende Klausur vorbereiten. 

#### 2.3.2 Ziele der Anwendung 
Unsere Anwendung soll am Ende der Projektzeit ein funktionierendes und spaßiges Spiel sein. Das Allgemeinwissen abfragt 
und vermittelt. Dieses Spiel soll eine große Zeilgruppe ansprechen und soll mit nazu jeder Altersgruppe spielbar sein. 


### 2.4 Zielgruppe
 Um den Umgang mit Dynamischen Datenstrukturen und Generics den Nutzer näher zu brigen, soll dieses Projekt programmiert 
werden. Hierzu agieren verschiedne Gruppen in Projekt "Lernende", "Nutzer" und "Lehrkräfte". Alle Gruppen haben andere
Aufgaben.

| **Anforderungsbeitragende** | **Anforderung**                                                                                                                                                                                                  |
|-----------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Lernende                    | Durch dieses Projekt sollen die Lernenden Dynamische Datenstrukturen und Generics lernen und das Wissen der letzten 1,5 Jahren abrufen.                                                                          |
| Nutzer                      | Der Nutzer des Projektes soll das Spiel spielen, sein Allgemienwissen abfragen und spaß und freude am Spiel haben.                                                                                               |
| Lehrkräfte                  | Die Lehrkräfte sollen die Korrektheit des Code Kontrollieren und das Projekt in die richtige Richtungfürhren. Sie sind die ansprech Partner für die Lernende und werden die Korrektheit des Porjektes bewerten.  |

## 3 Anforderungen

### 3.1 Funktionale Anforderungen

Unser Programm hat sechs Anforderungen. Der User startet die Anwendung und das Menü öffnet sich in einem Fenster.
Danach kann der User im Menü die drei Spielmodi starten. Des Weiteren kann er im Menü in die Optionen gelangen und 
sich das Leaderboard anzeigen lassen.

| Kürzel | Funktionsname            | Funktionsbeschreibung                                           |
|--------|--------------------------|-----------------------------------------------------------------|
| F1     | Anzeige des Menu         | Das Menu wird in einem Fenster angezeigt                        |
| F2     | Menü Spielmodus Standard | Der Spielmodus Standard wird gestartet                          |
| F3     | Menü Spielmodus Survive  | Der Spielmodus Survive wird gestartet                           |
| F4     | Menü Spielmodus Jeopardy | Der Multiplayer Spielmodus wird gestartet                       |
| F5     | Menü Optionen            | Die Optionen werden angezeigt                                   |
| F6     | Menü Leaderboard         | Das Leaderboard mit den verschiedenen Highscores wird angezeigt |


### 3.2 Nicht-funktionale Anforderungen

| Kürzel | Funktionsname         | Funktionsbeschreibung                                                              |
|--------|-----------------------|------------------------------------------------------------------------------------|
| NF1    | Lock and feel         | Der Text "hello world" wird ausgegeben.                                            |
| NF2    | Lock and feel         | Die Ausgabe der Texte soll unmittelbar erfolgen.                                   |
| NF3    | Internationalisierung | Es ist langfristig vorgesehen, die Texte in verschiedenen Übersetzungen anzuzeigen |
| NF4    | Sicherheit            | Diesbezüglich liegen keine Anforderungen vor.                                      |
| NF5    | Normen                | EDie Anwendung braucht keine besonderen Normen zu erfüllen.                        |

## 4 Entwürfe

### 4.1 Klassendiagramm
*Bevor Sie Beginnen zu implementieren ist hier ein Klassendiagramm anzugeben.*

![Klassendiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/dynamische-Datenstrukturen-Team-4/master/doku/lastenheft/Diagramme/Klassendiagramm.puml)

### 4.2 Objektdiagramm
*Auf Basis Ihres Klassendiagramms ist hier ein Objektdiagramm anzugeben.*

![Objektdiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/dynamische-Datenstrukturen-Team-4/master/doku/lastenheft/Diagramme/Objektdiagramm.puml)

### 4.3 Sequenzdiagramm
*Hier wird ein Sequenzdiagramm zu einer Funktion aus 3.1 dargestellt.*

![Sequenzdiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/dynamische-Datenstrukturen-Team-4/master/doku/lastenheft/Diagramme/Sequenzdiagramm.puml)