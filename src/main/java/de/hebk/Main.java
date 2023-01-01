package de.hebk;

import de.hebk.csv.CSVReader;
import de.hebk.gamemode.ModeSurvive;
import de.hebk.model.list.List;
import de.hebk.model.queue.Queue;
import de.hebk.model.stack.Stack;

public class Main {
    public static void main(String[] args) {

        //Erstellt eine List für den Typ String
        List<String> l1 = new List<String>();

        System.out.println("Hello world!");

        testSurvive();
    }


    private static void testQueue(){
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
    private static void testStack() {
        Stack<String> s1 = new Stack<String>();
        System.out.println("----\nStacktester");

        s1.push("aa");
        s1.push("bb");
        System.out.println(s1);
        System.out.println(s1.top());
        s1.pop();
        System.out.println(s1);

    }
    private static void testStackQ() {
        String adress;
        adress = "C:\\Users\\aswin.peterf\\IdeaProjects\\dynamische-Datenstrukturen-Team-4myFork\\src\\main\\java\\de\\hebk\\csv\\Testcsv";
        CSVReader c = new CSVReader();
        c.readCSVListST(adress);
        System.out.println(c);
    }
    private static void testSurvive() {
        ModeSurvive s = new ModeSurvive();
        s.start();
    }
}