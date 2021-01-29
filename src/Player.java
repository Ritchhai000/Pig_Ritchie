public class Player {

    int totalScore = 0, roundScore = 0;
    String name;

    Die die = new Die();

    public Player(){
        totalScore = 0;
        roundScore = 0;
        name = "Player 1";
    }

    public void turn(){

        roll();
        scoreRound();
        System.out.println();
    }

    public void roll(){

        die.roll();
    }

    public void score(){

        totalScore += roundScore;
        roundScore = 0;
    }

    public void roundScore(){

        roundScore += die.getValue();
    }

    public void scoreRound(){

        if(die.getValue() == 1){
            roundScore = 0;
        }else{
            roundScore += die.getValue();
        }
    }

    public int getRoundScore(){

        return roundScore;
    }

    public int totalScore(){

        return totalScore;
    }

    public String toString(){

        String message = "Round Total: " + roundScore;
        message += "\nTotal Score: " + totalScore;

        return message;
    }


}
