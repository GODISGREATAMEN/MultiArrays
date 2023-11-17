package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNumber;
        boolean isWinner = false;
        int[][] lotteryNumbers = new int[][]{
                {29, 16, 50, 37},
                {43, 17, 88, 99},
                {21, 34, 51, 8},
                {49, 91, 27, 76}};

        System.out.println("Hi!\nEnter the number you expect to be the winning one:");

        if (scan.hasNextInt()) {
            userNumber = scan.nextInt();
            for (int i = 0; i < lotteryNumbers.length && !isWinner; i++) {
                for (int j = 0; j < lotteryNumbers[i].length; j++) {
                    if (userNumber == lotteryNumbers[i][j]) {
                        isWinner = true;
                        break;
                    }
                }
            }
            if (!isWinner) {
                System.out.println("Unfortunately, you lost!\n");
            } else {
                System.out.println("You're lucky today!!!\n");
            }

            System.out.println("The ticket was:\n---------------------");

            for (int[] lotteryNumber : lotteryNumbers) {
                for (int i : lotteryNumber) {
                    System.out.print(i + "    ");
                }
                System.out.println();
            }

            System.out.println("---------------------");
        } else {
            System.out.println("You entered something wrong!");
        }
    }
}