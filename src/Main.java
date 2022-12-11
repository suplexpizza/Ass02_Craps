import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        boolean keepGoing = true;
        do
        {
            System.out.println();
            Scanner in = new Scanner(System.in);
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int total = die1 + die2;
            int point;
            boolean playing = true;
            String response;

            System.out.println("You rolled a " + die1 + " and, a " + die2 + " Which sums to: " + total);
            if (total == 2 || total == 3 || total == 12)
            {
                System.out.println("sorry but a roll of " + total + " means you crapped out");
            }
            else if (total == 7 || total == 11) {
                System.out.println("You rolled a natural " + total + ". You win!");
            }
            else
            {
                point = total;
                System.out.println("The point you are now rolling for is: " + point);
                while (playing)
                {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    total = die1 + die2;
                    System.out.println("You rolled a " + die1 + " and, a " + die2 + " Which sums to: " + total);
                    if (total == point)
                    {
                        System.out.println("You made point " + total + " which means you win!");
                        playing = false;
                    }
                    else if (total == 7)
                    {
                        System.out.println("You got a " + total + " which means you lost");
                        playing = false;
                    }
                }
            }
            System.out.println("Do you want to keep playing? [Y/N]");
            do
            {
                response = in.nextLine();
                if (response.equalsIgnoreCase("N")) {
                    keepGoing = false;
                }
                else if (!(response.equalsIgnoreCase("Y")))
                {
                    System.out.println("Invalid Command. Please Enter 'Y' or 'N'");
                }
            }while (!(response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("N")));
        }while(keepGoing);
    }
}