import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Basically, It's asking to get a program
to make multiples of 3x1, 5x1, 3x2, 5x2
but it has to be, below 16 and the sum
of the multiples to be below 1000*/

public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        int numbersBelow16 = 16;
        List<Integer> checkingForDuplicates = new ArrayList<>();

        for (int i = 1; i < numbersBelow16; i++) {
            for (int j = 5; j < numbersBelow16; j++) {

            if (i % 3 == 0 && !checkingForDuplicates.contains(i)) {
                System.out.println(i);
                checkingForDuplicates.add(i);
                sum += i;
            }

                if (j % 5 == 0 && !checkingForDuplicates.contains(j)) {
                    System.out.println(j);
                    checkingForDuplicates.add(j);
                    sum += j;
                }
            }

        }
        System.out.println("The sum is " + sum);
    }

}