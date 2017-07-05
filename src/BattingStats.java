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
        int atBats = 0;


        System.out.println("Enter number of times at bat: ");
        atBats = scan.nextInt();

        while (atBats < 0) {
            System.out.println("Invalid input. Please enter your number of times at bat: ");
            atBats = scan.nextInt();
        }

        int[] arr = new int[atBats];
        System.out.println(arr.length);
        System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Result for at bat " + i + ": ");
            result = scan.nextInt();

            while (result < 0 | result > 4) {
                System.out.println("Invalid input. Please try again: ");
                result = scan.nextInt();
            }
            arr[i] = result;
        }

        double hits = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 1) {
            } else {
                hits = hits + 1;
            }

        }
        System.out.println("Batting average: " + (hits / atBats));

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Slugging Percentage: " + (sum / atBats));
    }
}
