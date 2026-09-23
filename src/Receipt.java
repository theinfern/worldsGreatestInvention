public class Receipt {
    public static void main(String[] args) {
        //all my variables - lcd soundsystem
        String name = "Stacey";
        int spending = 40;
        double appleCost = 0.6;
        double pineappleCost = 3.59;
        double riceCost = 1.39;
        final double POUND = 0.4536;
        int numApples = 12;
        int numPineapples = 2;
        int numRice = 3;
        int numItems = numApples + numPineapples + numRice;
        int riceWeight = 2;
        double totalCost = numApples * appleCost + numPineapples * pineappleCost + riceWeight / POUND * numRice * riceCost;

        //print receipt
        System.out.println("----------");
        System.out.println("Customer: " + name);
        System.out.println("Number of items: " + numItems);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Average Cost: $" + totalCost / numItems);
        System.out.println(" ");
        System.out.println("Cash Tendered: $" + spending);
        System.out.println("Change Received: $" + (spending - totalCost));
        System.out.println("----------");
    }
}