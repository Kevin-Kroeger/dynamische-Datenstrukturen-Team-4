package de.hebk.gamemode;

import de.hebk.gamemode.Gamemode;
import de.hebk.csv.CSVReader;
import de.hebk.model.stack.Stack;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ModeSurvive extends Gamemode {
    private CSVReader c = new CSVReader();
    private int meinePunktzahl = 0;
    Scanner sc = new Scanner(System.in);
    private boolean fortschritt = true;
    private String addres = "C:\\Users\\aswin.peterf\\IdeaProjects\\dynamische-Datenstrukturen-Team-4myFork\\src\\main\\java\\de\\hebk\\csv\\Testcsv";
    Stack<Questions> a1 = c.readCSVListST(addres);
    public void start() {
        System.out.println("Als antowrt richtige Zahl angeben [1,2,3,4]!!!!!");
        while(fortschritt) {
            fortschritt=richtigSingle();
            a1.pop();
            if(meinePunktzahl % 5 == 0) {
                System.out.println(meinePunktzahl);
            }
            }
        System.out.println("-----\n"+meinePunktzahl);
        }

    public boolean richtigSingle() {
        try {
            a1.top().getQuestion();
        } catch (Exception e) {
            System.out.println("Herzlichen Glückwunsch, du hast alle Fragen beantwortet!");
            System.out.println(meinePunktzahl);
            System.exit(0);
        }
        a1.top().randomAnswers();
        System.out.println("-----\n"+a1.top().getTopic()+"\n"+a1.top().getQuestion()+"\n"+Arrays.toString(a1.top().getAnswers())+"\n"+"Stelle angeben");
        int i = sc.nextInt();
        String antwort = a1.top().getSpecificAnswer(i-1);
        if(Objects.equals(a1.top().getCorrect(), antwort)) {
            meinePunktzahl++;
            return true;
        } else {
            return false;
        }
    }
}
