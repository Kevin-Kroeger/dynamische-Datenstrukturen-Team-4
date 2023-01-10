package de.hebk.gamemode;
import java.util.Random;


public class Questions {
    private String topic;
    private String question;
    private String[] answers = new String[4];
    private String correct;
    private int difficulty;

    /**
     * Konstruktor
     * @param pTopic
     * @param pQuestion
     * @param pAnswers
     * @param pCorrect
     * @param pDifficulty
     */
    public Questions(String pTopic,String pQuestion, String[] pAnswers, String pCorrect, int pDifficulty){
        setTopic(pTopic);
        setQuestion(pQuestion);
        setAnswers(pAnswers);
        setCorrect(pCorrect);
        setDifficulty(pDifficulty);
    }

    /**
     * Methode um die Antwortmöglichkeiten im Array zu verändern
     * → Das Array wird gemischt
     */
    public void randomAnswers(){
        Random rand = new Random();
        for (int i = 0; i < getAnswers().length; i++) {
            if(getAnswers()[i] != null ){
                int randomIndexToSwap = rand.nextInt(getAnswers().length);
                String temp = getAnswers()[randomIndexToSwap];
                getAnswers()[randomIndexToSwap] = getAnswers()[i];
                getAnswers()[i] = temp;
            }
        }
    }

    /**
     *
     * @return
     */
    public String getTopic() {
        return topic;
    }

    /**
     *
     * @param topic
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     *
     * @return
     */
    public String getQuestion() {
        return question;
    }

    /**
     *
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     *
     * @return
     */
    public String[] getAnswers() {
        return answers;
    }

    /**
     *
     * @param i
     * @return
     */
    public String getSpecificAnswer(int i) {return answers[i];}

    /**
     *
     * @return
     */
    public String getCorrect() {
        return correct;
    }

    /**
     *
     * @param correct
     */
    public void setCorrect(String correct) {
        this.correct = correct;
    }

    /**
     *
     * @return
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     *
     * @param difficulty
     */
    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    /**
     *
     * @param answers
     */
    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    /**
     * toString Mehtode
     * @return
     */
    public String toString(){
        String ret = "";
        for(int i = 0; i < answers.length; i++){
            ret = ret + answers[i] + " ";
        }
        return ret;
    }
}
