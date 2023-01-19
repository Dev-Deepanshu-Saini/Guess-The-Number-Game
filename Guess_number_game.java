//This is made by "Deepanshu Saini"

import java.util.Scanner;
import java.util.Random;
// Guess number game ---------------------------------------->
public class Guess_number_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();

        System.out.println("Hi!!\nLet's play \"Guess the number\"");

        int a = ra.nextInt(101);

        System.out.println("Now, Enter the number that I am thinking:)");

        for (int i = 1; i <= 100; i++) {
            int b = sc.nextInt();
            if (a == b) {
                System.out.println("Wow, you guess it right!!!\nYour score = " + i);
                break;
            } else if (a > b) {
                System.out.println("Think a bigger one...");
            } else {
                System.out.println("Think a smaller one...");
            }
        }
    }
}