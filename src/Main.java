import java.util.Scanner;
public class Main {

        //Roll the die and tru not to get a 1. If you get a 1, you lose all points for the round.
        //The goal is to get 100 points.

        //Roll the die
        //Score for the round
        //Output round score and total score
        //Prompt player to continue rolling
        //Add round score to total score
        //Move to next player

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Player p1 = new Player();

        p1.turn();
        System.out.println("*******************************");
        System.out.println("Would you like to roll again?");
        System.out.println("*******************************");
        String again = read.nextLine();

        if(again.equalsIgnoreCase("yes") && p1.getRoundScore() > 0){

            System.out.println("REAPEAT");
        }else{

            System.out.println("Next player");
        }
    }
}
