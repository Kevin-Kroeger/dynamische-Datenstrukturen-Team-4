package de.hebk.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import de.hebk.gamemode.*;
import de.hebk.model.list.*;
import de.hebk.model.stack.Stack;

public class CSVReader {

    /**
     * Diese Methode liest die Datei mit den Fragen.
     * Danach wird von jeder Zeile ein neues Objekt der Klasse Question instanziiert.
     * Dieses Objekt wird dann der Liste hinzugefügt.
     * Die Liste mit allen Fragen wird dann zurückgegeben
     * @param path
     * @return
     */
    public List<Questions> readCSVList(String path){
        List<Questions> l1 = new List<Questions>();
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
                String[] arr = line.split(",");
                String[] questions = new String[4];
                for(int i = 0, j = 3; i < questions.length; i++,j++){
                    questions[i] = arr[j];
                }
                int diff = Integer.parseInt(arr[2]);
                l1.append(new Questions(arr[0],arr[1], questions,arr[3],diff));
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return l1;
    }
    public Stack<Questions> readCSVStack(String path) {
        Stack<Questions> s1 = new Stack<Questions>();
        String s;
        try {
            BufferedReader r = new BufferedReader(new FileReader(path));
            while((s = r.readLine())!=null) {
                String[] arr = s.split(",");
                String[] questions = new String[4];
                for(int i = 0, j = 3; i < questions.length; i++,j++){
                    questions[i] = arr[j];
                }
                int diff = Integer.parseInt(arr[2]);
                s1.push(new Questions(arr[0],arr[1],questions,arr[3],diff));
            }
            r.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return s1;
    }
}
