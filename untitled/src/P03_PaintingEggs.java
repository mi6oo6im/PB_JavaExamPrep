import java.util.Scanner;

public class P03_PaintingEggs {

    public static void main(String[] args) {
        //	                Червено (Red)	Зелено (Green)	Жълто (Yellow)
        //Големи (Large)	16 лв.	        12 лв.	        9 лв.
        //Средни (Medium)	13 лв.	        9 лв.	        7 лв.
        //Малки (Small)	    9 лв.	        8 лв.	        5 лв.
        Scanner scanner = new Scanner(System.in);

        String eggSize = scanner.nextLine(); // "Large", "Medium", "Small"
        String eggColor = scanner.nextLine(); // "Red", "Green", "Yellow"
        int countEggBatches = Integer.parseInt(scanner.nextLine());
        double batchPrice = 0;
        switch (eggSize) {
            case "Large":
                switch (eggColor) {
                    case "Red":
                        batchPrice = 16;
                        break;
                    case "Green":
                        batchPrice = 12;
                        break;
                    case "Yellow":
                        batchPrice = 9;
                        break;
                }
                break;
            case "Medium":
                switch (eggColor) {
                    case "Red":
                        batchPrice = 13;
                        break;
                    case "Green":
                        batchPrice = 9;
                        break;
                    case "Yellow":
                        batchPrice = 7;
                        break;
                }
                break;
            case "Small":
                switch (eggColor) {
                    case "Red":
                        batchPrice = 9;
                        break;
                    case "Green":
                        batchPrice = 8;
                        break;
                    case "Yellow":
                        batchPrice = 5;
                        break;
                }
                break;
        }
        double cost = batchPrice * countEggBatches;
        double expenses = cost * 0.35;
        double totalIncome = cost - expenses;

        System.out.printf("%.2f leva.", totalIncome);

    }
}
