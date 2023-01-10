# Probeklausur
Hilfsmittel: Anlagen der Abiturklausuren
#### 1. Erklären Sie den Unterschied zwischen dynamischen und statischen Datenstrukturen.

#### 2. Erläutern sie das FiFo und das LiFo Printip mit je einem Beispiel.

#### 3. Implementieren sie die Klasse _Knoten_ vom Typ _String_.

\
\
\
\
Die Methoden der Anlagen können als implementiert gelten.

#### 4. Implementieren sie die Methode _enqueue_ der Klasse _Queue_.

#### 5. Implementieren sie die Methode _pop_ der Klasse _Stack_.

#### 6. Implementieren sie die Methode _insert_ der Klasse _List_.

\
\
\

#### 7. Hier ist Quellcode gegeben, geben sie an was am Ende ausgegeben wird.
```Java
public class Abc {
    public void nichts(String s) {
        if(kopf == null) {
            kopf = new Knoten(s);
            return;
        }
        Knoten tmp = kopf;
        String p = tmp.getInhalt().toString();
        if(p.compareToIgnoreCase(s)>0) {
            kopf = Knoten(s);
            kopf.setNext(tmp);
        } else if(tmp.getNext()==null) {
            if(tmp.getInhalt().toString().compareToIgnoreCase(s)<0) {
                tmp.setNext(new Knoten(s));
            } else {
                kopf = new Knoten(s);
                kopf.setNext(tmp);
            }
        }
        else {
            while (tmp.getNext().getInhalt().toString().compareToIgnoreCase(s)<=0) {
                tmp = tmp.getNext();
                if(tmp.getNext()==null) {
                    tmp.setNext(new Knoten(s));
                    return;
                }
            }
            Knoten haelfte = tmp;
            tmp.setNext(new Knoten(s));
            tmp.setNext(haelfte);
        }
    }

    public static void main(String[] args) {
        Liste l1 = new Liste();
        l1.nichts("d");
        l1.nichts("r");
        l1.nichts("z");
        l1.nichts("a");
        System.out.println(l1);
    }
}
```
\
\
\
\

# Lösung
#### 1.
Eine statische Datenstruktur hat einen festen Speicherbedarf, der beim Erstellen reserviert wird und die Größe ist nicht veränderbar. Dafür haben die statischen Datenstrukturen zusammenhängende Daten in denen gespeichert, anders als bei dynamischen, in denen kann man verschiedene Daten speichern. Bei einem Array kann direkt auf das Element zugegriffen werden dadurch ist die Laufzeit O(1), bei einer dynamischen Datenstrukturen muss der Zeiger erst auf das entsprechende Element zeigen bevor man drauf zu greift. Bei Listen ist die Laufzeit O(n).

#### 2.
Last-In-First-Out --> Die neuen Objekte werden "oben auf den Stapel gelegt", das letzte Element ist oben. Beispiel: Stack, Papierstapel.
First-In-First-Out --> Die neuen Objekte werden "hinten angehängt", das letzte Objekt steht am Ende. Beispiel: Queue, Druckerwarteschlange.

#### 3.
```Java
public class Knoten {
    private String inhalt;
    private Knoten next;
    
    public Knoten(String pInhalt) {
        this.inhalt = pInhalt;
    }
    public getInhalt() {
        return inhalt;
    }
    public Knoten getNext() {
        return next;
    }
    public void setNext(Knoten pKnoten) {
        this.next = pKnoten;
    }
}
```
#### 4.
```Java
public class Queue {
    public void enqueue(String pInhalt) {
        if (first==null) {
            first = new Knoten(pInhalt);
        } else {
            Knoten n = first;
            while (n.getNext()!=null) {
                n = n.getNext();
            }
            n.setNext(new Knoten(pInhalt));
        }
    }
}
```
#### 5.
```Java
public class Stack {
    public void pop() {
        if (!isEmpty()) {
            Knoten n = first;
            first = n.getNext();
        }
    }
}
```
#### 6.

```Java
import java.util.Objects;

public class List {
    public void insert(String pInhalt) {
        Knoten tmp = first;
        if (hasAccess()) {
            if (Objects.equals(tmp.getInhalt(),current.getInhalt())) {
                first = new Knoten(pInhalt);
                first.setNext(tmp);
            } else {
                while (!Objects.equals(tmp.getNext().getInhalt(),current.getInhalt())) {
                    tmp = tmp.getNext();
                }
                tmp.setNext(new Knoten(pInhalt));
                tmp = tmp.getNext();
                tmp.setNext(current);
            }
        }
        if(isEmpty()) {
            first = new Knoten(pInhalt);
        }
    }
}
```
#### 7.
Der Quellcode sortiert alphabetisch, demnach ausgabe -> adrz.


