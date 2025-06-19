import java.util.Random;
import java.util.Scanner;

public class Q15_RockPaperScissors {
    public static String getComputerChoice() {
        int n = new Random().nextInt(3);
        if (n == 0) return "rock";
        else if (n == 1) return "paper";
        else return "scissors";
    }

    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0) / games);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", (compWins * 100.0) / games);
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%d\t%s\t%s\t%s\n", i+1, results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("\nPlayer\tWins\tWin %");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        String[][] results = new String[games][3];
        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            results[i][0] = user;
            results[i][1] = comp;
            results[i][2] = winner;
        }
        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(results, stats);
    }
}
