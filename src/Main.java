import java.util.Scanner;

// a program to get a number from the user
// and print whether it is positive or negative.

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Please enter a number: ");
        num = input.nextInt();

        if (num > 0)
            System.out.println("The entered number is Positive");
        else
            System.out.println("The entered number is Negative");
    }
}