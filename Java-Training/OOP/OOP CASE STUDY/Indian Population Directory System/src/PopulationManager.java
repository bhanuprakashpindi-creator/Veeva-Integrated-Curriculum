import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PopulationManager {
    MockData mockData=new MockData();
    HashMap<String, HashMap<String, Long>> populationManager = mockData.fetchMockData();
    Scanner scanner = new Scanner(System.in);
    public void addState() {
        System.out.println("Enter The State Name:");
        String name = scanner.nextLine();
        if (populationManager.containsKey(name)) {
            throw new GlobalExceptions.StateAlreadyExistsException("State Already Exists!!!");
        }

        populationManager.put(name, new HashMap<>());
        System.out.println("State Add Successfully..");
        return;
    }

    public void addCity() {
        System.out.println("Enter The State Name Of Where City Belongs");
        String stateName = scanner.nextLine();
        if (!populationManager.containsKey(stateName)) {
            throw new GlobalExceptions.StateNotFoundException("Error : State :" + stateName + " Not Found in the Database");
        }

        HashMap<String, Long> cities = populationManager.get(stateName);

        System.out.println("Enter The City Name");
        String cityName = scanner.nextLine();

        if (cities.containsKey(cityName)) {
            throw new GlobalExceptions.CityAlreadyExistsException("Error , City :" + cityName + " Already Exists!!");
        }

        System.out.println("Enter The Current Population Of The City");
        long popluation = scanner.nextLong();
        scanner.nextLine();
        if (popluation < 0) {
            throw new GlobalExceptions.InvalidPopulationException(
                    "Population cannot be negative!"
            );
        }
        cities.put(cityName, popluation);
        System.out.println("City Added SuccessFully");
    }

    public void updateCityPopulation() {
        System.out.println("Enter The State Name Of Where City Belongs");
        String stateName = scanner.nextLine();

        if (!populationManager.containsKey(stateName)) {
            throw new GlobalExceptions.StateNotFoundException("Error : State :" + stateName + " Not Found in the Database");
        }

        HashMap<String, Long> cities = populationManager.get(stateName);

        System.out.println("Enter The City Name");
        String cityName = scanner.nextLine();

        if (!cities.containsKey(cityName)) {
            throw new GlobalExceptions.CityNotFoundException("Error , City Not Found With The Name " + cityName + " in the State " + stateName);
        }

        System.out.println("Enter The Updated Population");
        long updatedPopulation = scanner.nextLong();
        scanner.nextLine();
        if (updatedPopulation < 0) {
            throw new GlobalExceptions.InvalidPopulationException(
                    "Population cannot be negative!"
            );
        }
        cities.put(cityName, updatedPopulation);
        populationManager.put(stateName, cities);
    }

    public void cityLookUp() {
        System.out.println("Enter The State Name Of Where City Belongs");
        String stateName = scanner.nextLine();
        if (!populationManager.containsKey(stateName)) {
            throw new GlobalExceptions.StateNotFoundException("Error : State :" + stateName + " Not Found in the Database");
        }

        HashMap<String, Long> cities = populationManager.get(stateName);

        System.out.println("Enter The City Name");
        String cityName = scanner.nextLine();

        if (!cities.containsKey(cityName)) {
            throw new GlobalExceptions.CityNotFoundException("Error , City Not Found With The Name " + cityName + " in the State " + stateName);
        }

        long population = cities.get(cityName);
        System.out.println("The Current Population Of the city " + cityName + " is :" + population);
    }

    public void stateLevelAggregation() {
        System.out.println("Enter The State Name Of Where City Belongs");
        String stateName = scanner.nextLine();

        if (!populationManager.containsKey(stateName)) {
            throw new GlobalExceptions.StateNotFoundException("Error : State :" + stateName + " Not Found in the Database");
        }

        populationManager.get(stateName).entrySet().stream().forEach(
                entry -> {
                    System.out.println(entry.getKey() + "->" + entry.getValue());
                }
        );

        Long totalPopulation = populationManager.get(stateName).values().stream().reduce(0L, ((a, b) -> a + b));
        System.out.println("Total Population In The State is :" + totalPopulation);
    }

    public void thresholdCities() {
        System.out.println("Enter The Population Threshold  To Find The Cities Across The India");
        double threshold = scanner.nextDouble();
        scanner.nextLine();

        populationManager.values().stream()
                .flatMap(cityMap -> cityMap.entrySet().stream())
                .filter(entry -> entry.getValue() > threshold)
                .forEach(entry -> {
                    System.out.println(entry.getKey() + "->" + entry.getValue());
                });
    }

    public void searchGlobal() {
        System.out.println("Enter The City Name To Find The State Name And Its Population");
        String cityName = scanner.nextLine();
        Map.Entry<String, HashMap<String, Long>> data = populationManager.entrySet().stream()
                .filter(entry -> {
                    if (entry.getValue().containsKey(cityName)) {
                        return true;
                    }
                    return false;
                }).findFirst().orElse(null);

        if (data == null) {
            throw new GlobalExceptions.CityNotFoundException("Error , City Not Found In the India");
        }

        System.out.println("We Found It!!!");
        System.out.println("State :" + data.getKey() + "\nCity:" + cityName + "\nPopulation :" + data.getValue().get(cityName));
    }
    public void displayAllData() {

        if (populationManager.isEmpty()) {
            System.out.println("No Data Available!");
            return;
        }

        populationManager.entrySet().stream()
                .forEach(stateEntry -> {
                    System.out.println("\n==================================");
                    System.out.println("State: " + stateEntry.getKey());
                    System.out.println("==================================");
                    stateEntry.getValue().entrySet().stream()
                            .forEach(cityEntry -> {
                                System.out.println(
                                        "City: " + cityEntry.getKey()
                                                + " | Population: " + cityEntry.getValue()
                                );
                            });

                    long totalPopulation = stateEntry.getValue()
                            .values()
                            .stream()
                            .mapToLong(Long::longValue)
                            .sum();

                    System.out.println("----------------------------------");
                    System.out.println("Total Cities: " + stateEntry.getValue().size());
                    System.out.println("Total Population: " + totalPopulation);
                });
    }
}