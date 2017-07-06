import java.util.Scanner;

/**
 * Created by Jayme Peoples on 7/5/2017.
 */
public class BattingStats {
    public static void main(String[] args) {
        //1. Ask for the number of at bats.
        //Print out integers that represent results of at-bats
        //2. Ask for the number of bases earned by the batter for each at bat
        //3. Display batting average
        //4. Slugging percentage
        Scanner scan = new Scanner(System.in);
        int atBats;
        String userChoice;

        do {
            System.out.println("Enter number of times at bat: ");
            atBats = scan.nextInt();

            while (atBats < 0) {//validates that number is positive
                System.out.println("Invalid input. Please enter your number of times at bat: ");
                atBats = scan.nextInt();
            }

            int[] arr = new int[atBats];
            System.out.println(arr.length);
            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
            int result;

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Result for at bat " + i + ": ");
                result = scan.nextInt();

                while (result < 0 | result > 4) {//results are for number of bases or an out.
                    System.out.println("Invalid input. Please try again: ");
                    result = scan.nextInt();
                }
                arr[i] = result;
            }

            double hits = 0;
            for (int j = 0; j < arr.length; j++) {//checks for number of hits, any result that is not a zero is a hit
                if (arr[j] < 1) {//< 1 not a hit
                } else {
                    hits = hits + 1;
                }

            }
            double batAvg = (hits/atBats);
            System.out.printf("Batting average: " + "%.3f", batAvg);
            System.out.println();

            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            double slugPercent = sum/atBats;
            System.out.printf("Slugging Percentage: " + "%.3f", slugPercent );
            System.out.println();
            System.out.println("Another batter: (y/n)");
            userChoice=scan.next();
        }
        while (userChoice.equalsIgnoreCase("y"));
            System.out.println("Thanks for your participation.");
        }
    }


