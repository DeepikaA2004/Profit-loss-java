public class Computation {
    public static void main(String[] args) {
        // Define the fixed costs (fc1, fc2, fc3)
        double fc1 = 2000.0;
        double fc2 = 4000.0;
        double fc3 = 6000.0;

        // Define the variable costs (vc1, vc2, vc3)
        double vc1 = 10000.0;
        double vc2 = 8000.0;
        double vc3 = 7000.0;

        // Define the sales (s1, s2, s3)
        double s1 = 16000.0;
        double s2 = 17000.0;
        double s3 = 8000.0;

        // Calculate the profit for each product
        double p1 = s1 - (fc1 + vc1);
        double p2 = s2 - (fc2 + vc2);
        double p3 = s3 - (fc3 + vc3);

        // Display the profit for each product
        System.out.println("Profit for Product A (p1): " + p1);
        System.out.println("Profit for Product B (p2): " + p2);
        System.out.println("Profit for Product C (p3): " + p3);

    }
}
