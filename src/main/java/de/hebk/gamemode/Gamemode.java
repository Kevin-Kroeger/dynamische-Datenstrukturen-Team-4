package de.hebk.gamemode;


public class  Gamemode {
    private Joker[] joker = new Joker[3];

    public Gamemode(){

    }
    public void useJoker(int pInput){
        if(joker[pInput] != null) {
            if(joker[pInput].getName().equals("fiftyfifty")){
                joker[pInput] = null;
            }else if(joker[pInput].getName().equals("telephone")){
                joker[pInput] = null;
            }else if(joker[pInput].getName().equals("audience")){
                joker[pInput] = null;
            }

        }
    }

    public void jokerHinzufuegen(Joker pJoker){
        for(int i = 0; i < joker.length; i++){
            if(joker[i] == null);{
                joker[i] = pJoker;
                return;
            }
        }
    }

    public Joker[] getJoker() {
        return joker;
    }

    public void setJoker(Joker[] joker) {
        this.joker = joker;
    }
}

