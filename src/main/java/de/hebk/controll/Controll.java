package de.hebk.controll;


import de.hebk.Game;
import de.hebk.controll.gui.Menu;
import de.hebk.controll.gui.ModenormalGui;
import de.hebk.gamemode.Gamemode;
import de.hebk.gamemode.ModeJeopardy;
import de.hebk.gamemode.ModeNormal;
import de.hebk.gamemode.ModeSurvive;

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

        }
    }

    public void showMenu(){
        menu = new Menu(this,"Menü");
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
