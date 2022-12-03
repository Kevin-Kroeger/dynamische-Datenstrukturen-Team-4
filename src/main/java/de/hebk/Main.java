package de.hebk;

import de.hebk.model.list.List;
import de.hebk.model.queue.Queue;

public class Main {
    public static void main(String[] args) {

        //Erstellt eine List für den Typ String
        List<String> l1 = new List<String>();

        System.out.println("Hello world!");
        Queue<String> q1 = new Queue<String>();
        q1.enqueue("a");
        q1.enqueue("b");
        q1.enqueue("c");
        q1.enqueue(null);
        q1.dequeue();
        System.out.println(q1);
        Queue<Integer> q2 = new Queue<Integer>();
        q2.enqueue(2);
        q2.enqueue(88);
        q2.dequeue();
        System.out.println(q2);
        System.out.println(q2.front());
        System.out.println(q2.isEmpty());

    }
}