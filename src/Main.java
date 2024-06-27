import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;
        int correctGuess = 0;
        int wrongGuess = 0;
        int numberOfGames = 1;

        while (playAgain) {
            System.err.println("You have 4 attempts to GUESS.!!");

            int random = 1 + (int) (Math.random() * 100);
            String result = "Wrong";

            for (int i = 0; i < 4; i++) {
                System.out.println("Enter a number: ");
                int userGuess = in.nextInt();

                String range = checkRange(random);
                if (random == userGuess) {
                    result = "Correct";
                    correctGuess++;
                    break;
                } else {
                    System.out.println(range);
                    wrongGuess++;
                }

                System.out.println("Your guess was " + userGuess);
            }

            System.out.println("The Computer's guess was: " + random);
            System.out.println("Your outcome: " + result);
            System.out.println("You got "+correctGuess + " correct.!");
            System.out.println("You got "+wrongGuess + " Wrong.!");
            System.out.println("Games Played "+numberOfGames);

            System.out.println("Do you want to play again? (yes/no): ");
            String userResponse = in.next();

            playAgain = userResponse.equalsIgnoreCase("yes");
            if(playAgain){
                numberOfGames++;
                System.out.println("Game Number " +numberOfGames);
            }
        }

        System.out.println("Thanks for playing!");
    }

    private static String checkRange(int random) {
        String output = "Number is between 75 and 100";
        if (random >= 1 && random <= 25) {
            output = "Number is between 1 and 25";
        } else if (random >= 25 && random <= 50) {
            output = "Number is between 25 and 50";
        } else if (random >= 50 && random <= 75) {
            output = "Number is between 50 and 75";
        }

        return output;
    }
}
