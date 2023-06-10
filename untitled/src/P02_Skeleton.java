import java.util.Scanner;

public class P02_Skeleton {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int targetMinutes = Integer.parseInt(scanner.nextLine());
        int targetSeconds = Integer.parseInt(scanner.nextLine()) + targetMinutes * 60;
        double rampLength = Double.parseDouble(scanner.nextLine());
        int secondsForHundredMeters = Integer.parseInt(scanner.nextLine());

        double speedSeconds = (rampLength / 120) * 2.5;

        double totalTimeSeconds = (rampLength / 100) * secondsForHundredMeters - speedSeconds;

        if (totalTimeSeconds <= targetSeconds){
            System.out.printf("Marin Bangiev won an Olympic quota!%nHis time is %.3f.", totalTimeSeconds);
        } else {
            double deltaTimeSeconds = totalTimeSeconds - targetSeconds;
            System.out.printf("No, Marin failed! He was %.3f second slower.", deltaTimeSeconds);
        }
    }
}
