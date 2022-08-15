package FixtureGenerator;

import java.util.ArrayList;
import java.util.Scanner;

public class FixtureGenerator {


    public void generate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many teams should the fixture table have? :");
        int teams = scanner.nextInt();
        String team;
        String roundString;
        ArrayList<String> teamsList = new ArrayList<>();
        for (int i = 0; i < teams; i++) {
            System.out.print((i + 1) + ". team: ");
            team = scanner.next();
            teamsList.add(team);
        }
        if (teams % 2 == 1) {
            teams++;
            teamsList.add("PASS");
        }

        int totalRounds = (teams - 1) * 2;
        int halfRoundMark = (totalRounds / 2);
        int matchesPerRound = teams / 2;

        String[][] rounds = new String[totalRounds][matchesPerRound];

        for (int round = 0; round < totalRounds; round++) {
            for (int match = 0; match < matchesPerRound; match++) {
                int home = (round + match) % (teams - 1);
                int away = (teams - 1 - match + round) % (teams - 1);
                // Last team stays in the same place
                // while the others rotate around it.
                if (match == 0) {
                    away = teams - 1;
                }
                // Add one so teams are number 1 to teams
                // not 0 to teams - 1 upon display.

                if (round < halfRoundMark) {
                    roundString = (" " + teamsList.get(home)
                            + " vs " + teamsList.get(away));
                } else {
                    roundString = (" " + teamsList.get(away)
                            + " vs " + teamsList.get(home));
                }
                rounds[round][match] = roundString;
            }
        }

        for (int i = 0; i < rounds.length; i++) {
            System.out.println("WEEK " + (i + 1));
            for (int j = 0; j < rounds[i].length; j++) {
                System.out.println(rounds[i][j]);
            }
            System.out.println();
        }
    }


}
