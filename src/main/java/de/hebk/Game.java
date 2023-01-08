package de.hebk;
import de.hebk.*;
import de.hebk.controll.*;
import de.hebk.user.*;
import de.hebk.gamemode.*;
import de.hebk.csv.*;

public class Game {
    private User user;
    private Controll ctrl;
    private CSVReader csv;
    private Gamemode gamemode;


    public Game(){
        ctrl = new Controll(this);
        csv = new CSVReader();
        ctrl.showMenu();
    }

    public void createUser(String pName, int pAge, int pPoints){
        user.setName(pName);
        user.setAge(pAge);
        user.setPoints(pPoints);
    }




    /**
     *Erstmal zum Testen
     */
    public void startGame(int input){
        if(input == 1){
            gamemode = new ModeNormal();
            gamemode.jokerHinzufuegen(new Joker("50/50 Joker"));
            gamemode.jokerHinzufuegen(new Joker("Telefon Joker"));
            gamemode.jokerHinzufuegen( new Joker("Zuschauer Joker"));
            gamemode.setModeNormal(csv.readCSVList("src/main/java/de/hebk/csv/questions.csv"));
        }else if(input == 2){
            gamemode = new ModeSurvive();
            gamemode.setModeSurvive(csv.readCSVStack("src/main/java/de/hebk/csv/questions.csv"));
        }else if(input == 3){
            gamemode = new ModeJeopardy();
            gamemode.setModeJeopardy(csv.readCSVQueue("src/main/java/de/hebk/csv/questions.csv"));
        }
    }

    /*
    Getter und Setter
     */
    public User getUser() {
        return user;
    }
    public Controll getCtrl() {
        return ctrl;
    }

    public void setCtrl(Controll ctrl) {
        this.ctrl = ctrl;
    }

    public CSVReader getCsv() {
        return csv;
    }

    public void setCsv(CSVReader csv) {
        this.csv = csv;
    }

    public Gamemode getGamemode() {
        return gamemode;
    }
    public void setGamemode(Gamemode pGamemode){
        this.gamemode = pGamemode;
    }
}
