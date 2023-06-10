import java.util.Scanner;

public class P05_CareOfPuppy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int boughtFood = Integer.parseInt(scanner.nextLine()) * 1000;
        int totalFoodEaten = 0;
        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            int foodEaten = Integer.parseInt(input);
            totalFoodEaten += foodEaten;
            input = scanner.nextLine();
        }
        int deltaFood = Math.abs(totalFoodEaten - boughtFood);
        if (boughtFood >= totalFoodEaten){
            System.out.printf("Food is enough! Leftovers: %d grams.", deltaFood);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", deltaFood);
        }
    }
}
