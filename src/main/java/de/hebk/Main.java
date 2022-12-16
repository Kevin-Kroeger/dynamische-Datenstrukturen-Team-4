package de.hebk;

import de.hebk.controll.Controll;
import de.hebk.csv.CSVReader;
import de.hebk.model.list.List;
import de.hebk.model.queue.Queue;
import de.hebk.model.stack.Stack;

public class Main {
    public static void main(String[] args) {
        CSVReader csv = new CSVReader();
        Controll controll = new Controll();
        Game g = new Game(csv,controll);
        g.startGame(1);
    }



}