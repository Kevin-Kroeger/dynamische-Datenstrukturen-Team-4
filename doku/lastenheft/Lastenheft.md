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
*Eine kurze Einstimmung zum Projekthintergrund*



## 2 Soll-Konzept

### 2.1 Anwendungsbreiche
*Beschreibung der vorgesehenen Anwendungsfälle des zu schaffenden Systems.*

Die Anwendung soll 

### 2.2 Systemidee
*Welche Idee wird mit dem System umgesetzt?*

Eine einfache und übersichtliche Java-Anwendung, welche in der Konsole zu starten ist, gibt einen kurzen
Text aus. Wird die Anwendung mit einem entsprechenden Parameter gestartet, wird ein Hilfetext
ausgegeben

### 2.3 Ziele
*Welche konkreten Ziele sollen erreicht werden? (Aufteilung der Idee in Teilziele)*

Nicht mit dem System, sondern anhand des Systems soll der Softwareentwicklungsprozess veranschaulicht
werden

### 2.4 Zielgruppe
*Benennung der Anforderungsbeitragenden mit Bezug zu deren Anforderungen*

us dem Ziel, den Softwareentwicklungsprozess zu veranschaulichen und andererseits ein einfaches Hello-world-Programm zu entwickeln, lassen sich folgende Beteiligte den grob erfassten Anforderungen zuordnen:

| **Anforderungsbeitragende** | **Anforderung**                                                                                                                                                                                          |
|-----------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Lernende                    | Anhand des Systems soll der Softwareentwicklungsprozess praktisch veranschaulicht werde                                                                                                                  |
| Nutzer                      | Das System soll die Zeichenkette „hello world“ ausgeben. Das System soll an das Betriebssystem einen Exit-Code zurückgeben. Das System kann  einen Hilfetext ausgeben                                    |
| Lehrkräfte                  | Die Analyse des Systems soll objektorientiert erfolgen. Für Modellierung und Dokumentation soll UML2 genutzt werden. Die Implementierung soll in Java erfolgen, der Code soll gewisse Vorgaben erfüllen. |

## 3 Anforderungen

### 3.1 Funktionale Anforderungen

Unser Programm hat sechs Anforderungen. Der User startet die Anwendung und das Menü öffnet sich in einem Fenster.
Danach kann der User im Menü die drei Spielmodi starten. Des Weiteren kann er im Menü in die Optionen gelangen und 
sich das Leaderboard anzeigen lassen.

| Kürzel | Funktionsname                            | Funktionsbeschreibung                                           |
|--------|------------------------------------------|-----------------------------------------------------------------|
| F1     | Anzeige des Menu                         | Das Menu wird in einem Fenster angezeigt                        |
| F2     | Menü Anzeigen der verschiedenen Spielmodi | Die Spielmoid Standard, Survive und Geopardy werden angezeigt   |
| F3     | Menü Optionen                            | Die Optionen werden angezeigt                                   |
| F4     | Menü Leaderboard                         | Das Leaderboard mit den verschiedenen Highscores wird angezeigt |


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