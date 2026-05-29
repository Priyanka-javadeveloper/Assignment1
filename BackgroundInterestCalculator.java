package com.FirstProject;

	import java.util.Scanner;
	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	import java.util.concurrent.Future;

	public class BackgroundInterestCalculator {

	    // Method to calculate Simple Interest
	  public static double calculateSimpleInterest(double principal, double rate, double time) {
	        return (principal * rate * time) / 100.0;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            // Input validation
	            System.out.print("Enter Principal Amount: ");
	            if (!scanner.hasNextDouble()) {
	                System.out.println("Invalid input. Please enter a numeric value.");
	                return;
	            }
	            double principal = scanner.nextDouble();

	            System.out.print("Enter Annual Interest Rate (%): ");
	            if (!scanner.hasNextDouble()) {
	                System.out.println("Invalid input. Please enter a numeric value.");
	                return;
	            }
	            double rate = scanner.nextDouble();

	            System.out.print("Enter Time in Years: ");
	            if (!scanner.hasNextDouble()) {
	                System.out.println("Invalid input. Please enter a numeric value.");
	                return;
	            }
	            double time = scanner.nextDouble();

	            // Create a single-thread executor for background task
	            ExecutorService executor = Executors.newSingleThreadExecutor();

	            // Submit the interest calculation as a background task
	            Future<Double> futureInterest = executor.submit(() -> {
	                // Simulate heavy computation delay
	                Thread.sleep(2000);
	                return calculateSimpleInterest(principal, rate, time);
	            });

	            System.out.println("Calculating interest in the background...");

	            // Do other work here while interest is being calculated
	            System.out.println("You can continue using the program while calculation is running...");

	            // Get the result (waits if not ready)
	            double interest = futureInterest.get();
	            System.out.printf("Simple Interest: %.2f%n", interest);

	            executor.shutdown();

	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
}
