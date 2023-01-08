package de.hebk.controll;


import de.hebk.Game;
import de.hebk.controll.gui.*;
import de.hebk.gamemode.Gamemode;
import de.hebk.gamemode.ModeJeopardy;
import de.hebk.gamemode.ModeNormal;
import de.hebk.gamemode.ModeSurvive;
import de.hebk.model.list.List;
import de.hebk.user.User;

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

        }else if(pGamemode instanceof ModeJeopardy){
            showLogin();
            if(game.getUser()[0] != null && game.getUser()[1] != null){
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

    public void showMenu(){
        menu = new Menu(this,"Menü");
    }

    public void showSelection(){
        GamemodeSelection selection = new GamemodeSelection(this,"Spielen");
    }
    public void showLogin(){
        LogIn logIn = new LogIn(this,"LogIn");

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
