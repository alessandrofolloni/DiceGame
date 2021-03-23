package pkg1;

import java.util.Random;

/**
 * Write a program that plays a simple dice game between the computer and the
 * user. When the program runs, a loop should repeat 10 times. Each iteration of
 * the loop should do the following:
 * <p>
 * Generate a random integer in the range of 1 through 6. This is the value of
 * the computer’s die. Generate another random integer in the range of 1 through
 * 6. This is the value of the user’s die. The die with the highest value wins.
 * In case of a tie, there is no winner for that particular roll of the dice. As
 * the loop iterates, the program should keep count of the number of times the
 * computer wins, and the number of times that the user wins. It should also
 * display the results of each roll.
 * <p>
 * After the loop performs all of its iterations, the program should display who
 * was the grand winner: the computer or the user.
 *
 * @author Justin Musgrove
 */

public class DiceGame {
    public static final int NumberOfGames = 10;

    public static void main(String [] args) {
        int WinC = 0;
        int computer;
        int WinU = 0;
        int user;
        int Tied = 0;

        System.out.println("Chi vincerà?");

        for(int i=0; i<NumberOfGames; i++){
            System.out.println(computer=randomize());
            System.out.println(user=randomize());

            if(computer==user)
                Tied++;
            else{
                if(computer>user)
                    WinC++;
                else
                    WinU++;
            }

            System.out.println("Computer...." + WinC);
            System.out.println("User...." + WinU);
            System.out.printf("Tied games...%d \n\n", Tied);
        }

        if(WinC > WinU)
            System.out.println("Hai perso con un computer");
        else if(WinU>WinC)
            System.out.println("Hai battuto il computer, viva l'umanità");
        else
            System.out.println("La lotta fra computer e uomo non finisce qui, parità");
    }

    public static int randomize(){
        Random newRand = new Random();
        return newRand.nextInt(6)+1;
    }
}
