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


    public Game(CSVReader pCsv, Controll pCtrl){
        setCsv(pCsv);
        setCtrl(pCtrl);
    }

    public void createUser(String pName, int pAge, int pPoints){
        user.setName(pName);
        user.setAge(pAge);
        user.setPoints(pPoints);
    }
    public void startModeNormal(){
        gamemode = new ModeNormal(csv.readCSVList("src/main/java/de/hebk/csv/questions.csv"));
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

    public void setGamemode(Gamemode gamemode) {
        this.gamemode = gamemode;
    }
}
