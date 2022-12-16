package de.hebk.controll;


import de.hebk.Game;
import de.hebk.gamemode.Gamemode;
import de.hebk.gamemode.ModeNormal;

public class Controll {

    private Leaderboard leaderboard;
    private Game game;


    public Controll(){

    }

    public void gamemodeGui(Gamemode pGamemode){
        if(pGamemode instanceof ModeNormal) {
            ModenormalGui gui = new ModenormalGui(pGamemode, "Wer Wird Millionär");
        }
    }



    public Leaderboard getLeaderboard() {
        return leaderboard;
    }
}
