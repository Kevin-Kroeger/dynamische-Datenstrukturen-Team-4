package de.hebk.model.stack;


import de.hebk.model.node.Node;

/**
 *Objekte der Klasse Stack (Stapel) verwalten beliebige Objekte nach dem
 *Last-In-First-Out-Prinzip, d.h., das zuletzt abgelegte Objekt wird als erstes wieder
 *entnommen.
 * @param <T>
 */
public class Stack<T> {
    private Node<T> first;
    /**
     * Die Anfrage liefert den Wert true, wenn der Stapel keine
     * Objekte enthält, sonst liefert sie den Wert false.
     */
    public boolean isEmpty(){
        return first == null;
    }

    /**
     * Das Objekt pObject wird oben auf den Stapel gelegt. Falls
     * pObject gleich null ist, bleibt der Stapel unverändert
     */
    public void push(T pObjekt){
        if(pObjekt==null) {
            return;
        }
        if(first == null) {
            first = new Node<T>(pObjekt);
        } else {
            Node<T> a = first;
            first = new Node<T>(pObjekt);
            first.setNext(a);
        }
    }

    /**
     * Das zuletzt eingefügte Objekt wird von dem Stapel entfernt.
     * Falls der Stapel leer ist, bleibt er unverändert.
     */
    public void pop(){
        if(!isEmpty()) {
            first = first.getNext();
        }
    }

    /**
     * Die Anfrage liefert das oberste Stapelobjekt. Der Stapel bleibt
     * unverändert. Falls der Stapel leer ist, wird null zurückgegeben.
     */
    public T top(){
        if(first == null) {
            return null;
        }
        return this.first.getContext();
    }

    /**
     * toString zum überprüfen, kann später weg
     * @return
     */
    public String toString(){
        String ret = "[";
        Node<T> tmp = first;

        while (tmp != null){
            if(tmp.getNext() == null){
                ret = ret + tmp.getContext().toString();
            }else {
                ret = ret + tmp.getContext().toString()+";";
            }
            tmp = tmp.getNext();
        }


        ret = ret + "]";
        return ret;
    }
    public int getLenght(){
        int count = 1;
        if(first == null){
            return 0;
        }
        Node<T> tmp = first;
        while(tmp.getNext() != null){
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }
}
