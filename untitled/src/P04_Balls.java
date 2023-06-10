import java.util.Scanner;

public class P04_Balls {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ballsCount = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherBalls = 0;

        String color = null;
        for (int i = 0; i < ballsCount; i++) {
            color = scanner.nextLine();
            switch (color) {
                case "red":
                    totalPoints += 5;
                    redBalls++;
                    break;
                case "orange":
                    totalPoints += 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    yellowBalls++;
                    break;
                case "white":
                    totalPoints += 20;
                    whiteBalls++;
                    break;
                case "black":
                    totalPoints /= 2;
                    blackBalls++;
                    break;
                default:
                    otherBalls++;
                    break;
            }
        }
        System.out.printf("Total points: %d%n" +
                "Red balls: %d%n" +
                "Orange balls: %d%n" +
                "Yellow balls: %d%n" +
                "White balls: %d%n" +
                "Other colors picked: %d%n" +
                "Divides from black balls: %d", totalPoints, redBalls, orangeBalls, yellowBalls, whiteBalls, otherBalls, blackBalls);
    }
}
