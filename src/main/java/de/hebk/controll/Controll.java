package de.hebk.controll;


import de.hebk.Game;
import de.hebk.gamemode.Gamemode;
import de.hebk.gamemode.ModeNormal;

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
