
import java.util.Scanner;

public class Dashboard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PopulationManager manager = new PopulationManager();

        // Load Mock Data
        MockData mockData = new MockData();
        manager.populationManager = mockData.fetchMockData();

        System.out.println("Mock Data Loaded Successfully!");

        int choice;

        do {
            System.out.println("\n==============================================");
            System.out.println("       INDIAN POPULATION DIRECTORY SYSTEM");
            System.out.println("==============================================");

            System.out.println("1. Display All States and Cities");
            System.out.println("2. Add New State");
            System.out.println("3. Add New City");
            System.out.println("4. Update City Population");
            System.out.println("5. City Population Lookup");
            System.out.println("6. State Level Population Aggregation");
            System.out.println("7. Find Cities Above Population Threshold");
            System.out.println("8. Global City Search");
            System.out.println("9. Exit");

            System.out.println("==============================================");
            System.out.print("Enter Your Choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            try {

                switch (choice) {

                    case 1:
                        manager.displayAllData();
                        break;

                    case 2:
                        manager.addState();
                        break;

                    case 3:
                        manager.addCity();
                        break;

                    case 4:
                        manager.updateCityPopulation();
                        break;

                    case 5:
                        manager.cityLookUp();
                        break;

                    case 6:
                        manager.stateLevelAggregation();
                        break;

                    case 7:
                        manager.thresholdCities();
                        break;

                    case 8:
                        manager.searchGlobal();
                        break;

                    case 9:
                        System.out.println("Thank You For Using Population Directory System!");
                        break;

                    default:
                        System.out.println(
                                "Invalid Choice! Please Select Between 1-9."
                        );
                }

            } catch (GlobalExceptions e) {

                System.out.println("\n⚠ WARNING: " + e.getMessage());

            }

        } while (choice != 9);

        scanner.close();
    }
}