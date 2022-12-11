package de.hebk.gamemode;

import de.hebk.gamemode.Gamemode;
import de.hebk.csv.CSVReader;
import de.hebk.model.stack.Stack;

public class ModeSurvive extends Gamemode {
    private CSVReader c = new CSVReader();
    private String addres = "C:\\Users\\aswin.peterf\\IdeaProjects\\dynamische-Datenstrukturen-Team-4myFork\\src\\main\\java\\de\\hebk\\csv\\Testcsv";

    public void start() {

        Stack<Questions> a = c.readCSVListST(addres);
    }
}
