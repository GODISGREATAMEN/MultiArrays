package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        int[][] lotteryNumbers = new int[][]{
                {29, 16, 50, 37},
                {43, 17, 88, 99},
                {21, 34, 51, 8},
                {49, 91, 27, 76}};
        final int WINNING_NUMBER = lotteryNumbers[2][1];

        System.out.println("Thank you for your purchase!");
        System.out.println("You have the following ticket:");
        System.out.println("---------------------");
        for (int[] lotteryNumber : lotteryNumbers) {
            for (int i : lotteryNumber) {
                System.out.print(i + "    ");
            }
            System.out.println();
        }
        System.out.println("---------------------\nYou need to choose one number!");
        System.out.println("Caution: Only one number can be the winning one\nEnter your number:");

        if (scan.hasNextInt()) {
            userNumber = scan.nextInt();
            if (userNumber == WINNING_NUMBER) {
                System.out.println("You're lucky today, you won!!!");
            } else {
                System.out.println("Unfortunately, you lost!");
                System.out.println("The winning number was: " + WINNING_NUMBER);

            }
        } else {
            System.out.println("You entered something different!\nTry again!!!");
        }
    }
}