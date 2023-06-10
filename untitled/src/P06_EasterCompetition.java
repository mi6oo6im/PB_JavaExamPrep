import java.util.Scanner;

public class P06_EasterCompetition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int easterBreads = Integer.parseInt(scanner.nextLine());
        int bestBakerScore = 0;
        String bestBakerName = null;

        for (int bread = 0; bread < easterBreads; bread++) {

            String bakerName = scanner.nextLine();
            int totalScore = 0;
            String input = scanner.nextLine();
            while (!input.equals("Stop")){
                int currentScore = Integer.parseInt(input);
                totalScore += currentScore;
                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, totalScore);
            if (totalScore > bestBakerScore){
                bestBakerScore = totalScore;
                bestBakerName = bakerName;
                System.out.printf("%s is the new number 1!%n", bakerName);
            }
        }
        System.out.printf("%s won competition with %d points!", bestBakerName, bestBakerScore);
    }
}
