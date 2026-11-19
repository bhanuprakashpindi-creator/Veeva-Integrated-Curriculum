package Service;

import Repository.CashCounterRepository;

import java.util.*;

public class CashPayment implements PaymentService {

    private CashCounterRepository cashCounterRepository;

    public CashPayment(CashCounterRepository cashCounterRepository) {
        this.cashCounterRepository = cashCounterRepository;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public boolean payment(double amount) {

        System.out.println("\n========== CASH PAYMENT ==========");

        System.out.println("Enter The Number Of Notes For Each Denomination");

        double total = 0;

        int[] currency = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        // Creating temporary cash counter
        HashMap<Integer, Long> availableCash =
                new HashMap<>(cashCounterRepository.getCounter());

        // Accepting customer currency
        for (int i = 0; i < currency.length; i++) {

            System.out.print("Enter Number Of Rs." + currency[i] + " Notes: ");

            long count = sc.nextLong();
            sc.nextLine();

            if (count < 0) {
                System.out.println("Invalid Quantity!");
                System.out.println("Transaction Cancelled. Please Collect Your Money.");
                return false;
            }

            total = total + currency[i] * count;

            // Adding customer currency to temporary counter
            availableCash.put(
                    currency[i],
                    availableCash.get(currency[i]) + count
            );
        }

        System.out.println("\nTotal Cash Received: Rs." + total);

        // Checking sufficient funds
        if (total < amount) {

            System.out.println("Insufficient Funds!");
            System.out.println("Please Collect Your Inserted Money.");
            return false;
        }

        // Calculating balance
        double change = total - amount;

        // Exact payment
        if (change == 0) {
            System.out.println("Payment Completed Successfully!");
            cashCounterRepository.setCounter(availableCash);
            System.out.println("Cash Counter Updated Successfully!");
            return true;
        }

        System.out.println("Amount To Be Returned: Rs." + change);
        // Calculating change using temporary cash counter
        Map<Integer, Long> result =
                coinChange((int) change, availableCash);
        // Checking change availability
        if (result.isEmpty()) {

            System.out.println("Unable To Provide Exact Change!");
            System.out.println("Insufficient Change!");
            System.out.println("Please Collect Your Inserted Money.");

            return false;
        }

        // Displaying change details
        System.out.println("\n========== CHANGE DETAILS ==========");

        result.forEach((note, count) ->
                System.out.println("Rs." + note + " : " + count + " Notes")
        );

        // Removing returned currency from temporary counter
        for (Map.Entry<Integer, Long> entry : result.entrySet()) {

            int denomination = entry.getKey();

            long count = entry.getValue();

            availableCash.put(
                    denomination,
                    availableCash.get(denomination) - count
            );
        }

        // Updating actual cash counter
        cashCounterRepository.setCounter(availableCash);

        System.out.println("\nPayment Completed Successfully!");
        System.out.println("Change Returned Successfully!");
        System.out.println("Cash Counter Updated Successfully!");

        return true;
    }

    public Map<Integer, Long> coinChange(
            int amount,
            Map<Integer, Long> cashAvailable) {

        List<Integer> coins = new ArrayList<>(cashAvailable.keySet());

        coins.sort(Collections.reverseOrder());

        int n = coins.size();

        int INF = Integer.MAX_VALUE / 2;

        int[][] dp = new int[n + 1][amount + 1];

        int[][] selected = new int[n + 1][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, INF);
        }

        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {

            int coin = coins.get(i - 1);

            long available = cashAvailable.get(coin);

            int quantity = (int) Math.min(available, amount / coin);

            for (int j = 0; j <= amount; j++) {

                for (int k = 0; k <= quantity && k * coin <= j; k++) {

                    int previous = dp[i - 1][j - k * coin];

                    if (previous != INF) {

                        int current = previous + k;

                        if (current < dp[i][j]) {

                            dp[i][j] = current;

                            selected[i][j] = k;
                        }
                    }
                }
            }
        }

        if (dp[n][amount] == INF) {
            return new HashMap<>();
        }

        Map<Integer, Long> result = new LinkedHashMap<>();

        int remaining = amount;

        for (int i = n; i >= 1; i--) {

            int coin = coins.get(i - 1);

            int count = selected[i][remaining];

            if (count > 0) {

                result.put(coin, (long) count);

                remaining -= count * coin;
            }
        }

        return result;
    }
}