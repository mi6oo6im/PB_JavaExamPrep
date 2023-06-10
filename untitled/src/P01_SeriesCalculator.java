import java.util.Scanner;

public class P01_SeriesCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double duration = Double.parseDouble(scanner.nextLine());

        int allEpisodes = seasons * episodes;
        double allEpisodesDuration = allEpisodes * duration;
        double addsDuration = allEpisodesDuration * 0.2;
        double additionalTime = seasons * 10;
        double totalDuration = Math.ceil(allEpisodesDuration + addsDuration + additionalTime);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName, totalDuration);

    }
}
