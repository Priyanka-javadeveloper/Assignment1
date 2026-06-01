package com.miniproject;

import java.util.HashMap;
import java.util.Scanner;

public class WalletApp {
	 private static HashMap<String, User> users = new HashMap<>();
	    private static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("\n--- Digital Wallet ---");
	            System.out.println("1. Register");
	            System.out.println("2. Login");
	            System.out.println("3. Exit");
	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1 -> register();
	                case 2 -> login();
	                case 3 -> { System.out.println("Goodbye!"); return; }
	                default -> System.out.println("Invalid choice!");
	            }
	        }
	    }

	    private static void register() {
	        System.out.print("Enter username: ");
	        String username = sc.nextLine();
	        if (users.containsKey(username)) {
	            System.out.println("Username already exists!");
	            return;
	        }
	        System.out.print("Enter password: ");
	        String password = sc.nextLine();
	        users.put(username, new User(username, password));
	        System.out.println("Registration successful!");
	    }

	    private static void login() {
	        System.out.print("Enter username: ");
	        String username = sc.nextLine();
	        System.out.print("Enter password: ");
	        String password = sc.nextLine();

	        User user = users.get(username);
	        if (user != null && user.checkPassword(password)) {
	            System.out.println("Login successful!");
	            userMenu(user);
	        } else {
	            System.out.println("Invalid credentials!");
	        }
	    }

	    private static void userMenu(User user) {
	        while (true) {
	            System.out.println("\n--- Wallet Menu ---");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit Money");
	            System.out.println("3. Spend Money");
	            System.out.println("4. View Transactions");
	            System.out.println("5. Logout");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1 -> System.out.println("Balance: ₹" + user.getBalance());
	                case 2 -> {
	                    System.out.print("Enter amount: ");
	                    double amt = sc.nextDouble();
	                    user.deposit(amt);
	                    System.out.println("Deposited successfully!");
	                }
	                case 3 -> {
	                    System.out.print("Enter amount: ");
	                    double amt = sc.nextDouble();
	                    if (user.spend(amt)) {
	                        System.out.println("Transaction successful!");
	                    } else {
	                        System.out.println("Insufficient balance!");
	                    }
	                }
	                case 4 -> user.showTransactions();
	                case 5 -> { return; }
	                default -> System.out.println("Invalid choice!");
	            }
	        }
	    }
	}


