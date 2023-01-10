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
import de.hebk.user.User;
import de.hebk.controll.gui.LogIn;

import java.util.Random;

public class Controll {

    private Leaderboard leaderboard;
    private Game game;
    private Menu menu;

    /**
     * Konstruktor
     * @param pGame
     */
    public Controll(Game pGame){
        game = pGame;
    }

    /**
     * Hiermit wird die GUI des jeweiligen Gamemodes gestartet
     * @param pGamemode
     */
    public void gamemodeGui(Gamemode pGamemode){
        if(pGamemode instanceof ModeNormal) {
            ModenormalGui gui = new ModenormalGui(this,pGamemode, "Wer Wird Millionär");
        }else if(pGamemode instanceof ModeSurvive){
            ModesurviveGui gui1 = new ModesurviveGui(this,pGamemode,"Wie länge überstehst du?");
        }else if(pGamemode instanceof ModeJeopardy){
            if(game.getUser()[1] == null){
                showLogin();
            }else{
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
                ModejeopardyGui gui = new ModejeopardyGui(this, pGamemode,"Jeopardy",arr,game.getUser()[1]);
            }
        }
    }

    /**
     * öffnet das Menu
     */
    public void showMenu(){
        menu = new Menu(this,"Menü");
    }

    /**
     * öffnet die Gamemodeauswahl
     */
    public void showSelection(){
        GamemodeSelection selection = new GamemodeSelection(this,"Spielen");
    }

    /**
     * Öffnet den LogIN Screen
     */
    public void showLogin(){
        LogIn logIn = new LogIn(this,"LogIn");

    }

    /**
     * gibt das Leaderboard zurück
     * @return
     */
    public Leaderboard getLeaderboard() {
        return leaderboard;
    }

    /**
     * Setzt das Leaderboard
     * @param leaderboard
     */
    public void setLeaderboard(Leaderboard leaderboard) {
        this.leaderboard = leaderboard;
    }

    /**
     * Gibt das Game zurück
     * @return
     */
    public Game getGame() {
        return game;
    }

    /**
     * setzt das Game
     * @param game
     */
    public void setGame(Game game) {
        this.game = game;
    }
}
