package geekbrains.lesson_3;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Your task is to guess the number");
        for (int i = 10; i <= 30; i += 10) playLevel(i);
        System.out.println("You have won!!!");
         scanner.close();
    }

    private static void playLevel(int range) {
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Guess the number from 0 to " + range);
            int input_number = scanner.nextInt();
            if(input_number == number) {
                System.out.println("you guessed right.");
                break;
            } else if(input_number > number) {
                System.out.println("The hidden number is less");
            }   else {
                System.out.println("The hidden number is greater");
            }
        }
    }
}
