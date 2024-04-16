package com.pluralsight;

import java.util.Scanner;

public class HighScoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a game score (home:visitor|score:score): ");
        //get score as input
        String score = scanner.nextLine().trim();
        //split score into array by : and |
        String[] scoreParts = score.split("[:|]");
        //rename and convert values in scoreParts array
        String home = scoreParts[0];
        String visitor = scoreParts[1];
        int homeScore = Integer.parseInt(scoreParts[2]);
        int visitorScore = Integer.parseInt(scoreParts[3]);
        //check scores for winner
        if (homeScore > visitorScore) {
            System.out.printf("Winner: %s", home);
        } else {
            System.out.printf("Winner: %s", visitor);
        }
    }
}
