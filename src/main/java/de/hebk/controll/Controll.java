package de.hebk.controll;


import de.hebk.Game;
import de.hebk.controll.gui.GamemodeSelection;
import de.hebk.controll.gui.Menu;
import de.hebk.controll.gui.ModejeopardyGui;
import de.hebk.controll.gui.ModenormalGui;
import de.hebk.controll.gui.ModesurviveGui;
import de.hebk.gamemode.Gamemode;
import de.hebk.gamemode.ModeJeopardy;
import de.hebk.gamemode.ModeNormal;
import de.hebk.gamemode.ModeSurvive;
import de.hebk.model.list.List;

import java.util.Random;

public class Controll {

    private Leaderboard leaderboard;
    private Game game;
    private Menu menu;


    public Controll(Game pGame){
        game = pGame;
    }

    public void gamemodeGui(Gamemode pGamemode){
        if(pGamemode instanceof ModeNormal) {
            ModenormalGui gui = new ModenormalGui(this,pGamemode, "Wer Wird Millionär");
        }else if(pGamemode instanceof ModeSurvive){
            ModesurviveGui gui1 = new ModesurviveGui(this,pGamemode,"Wie länge überstehst du?");
        }else if(pGamemode instanceof ModeJeopardy){
            String[] topics = new String[]{"Erdkunde","Fangfrage","Musik","Filme","Naturwissenschaften","Geschichte","Wissenschaft"};
            List<String> list = new List<>();
            for(int i = 0; i < topics.length; i++){
                list.append(topics[i]);
            }
            String[] arr = new String[4];
            Random rand = new Random();
            for(int i = 0; i < arr.length;i++) {
                list.toFirst();
                int j = rand.nextInt(list.getLenght() + 1);
                for (int l = 0; l < j; l++) {
                    list.next();
                }
                arr[i] = list.getObject();
                list.remove();
            }
            ModejeopardyGui gui = new ModejeopardyGui(this, pGamemode,"Jeopardy",arr);
        }
    }

    public void showMenu(){
        menu = new Menu(this,"Menü");
    }

    public void showSelection(){
        GamemodeSelection selection = new GamemodeSelection(this,"Spielen");
    }

    public Leaderboard getLeaderboard() {
        return leaderboard;
    }

    public void setLeaderboard(Leaderboard leaderboard) {
        this.leaderboard = leaderboard;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
