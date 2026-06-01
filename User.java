package com.miniproject;

import java.util.ArrayList;

public class User {
	 private String username;
	    private String password;
	    private double balance;
	    private ArrayList<String> transactions;

	    public User(String username, String password) {
	        this.username = username;
	        this.password = password;
	        this.balance = 0.0;
	        this.transactions = new ArrayList<>();
	    }

	    public String getUsername() { return username; }
	    public boolean checkPassword(String input) { return password.equals(input); }

	    public double getBalance() { return balance; }

	    public void deposit(double amount) {
	        balance += amount;
	        transactions.add("Deposited: ₹" + amount);
	    }

	    public boolean spend(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            transactions.add("Spent: ₹" + amount);
	            return true;
	        }
	        return false;
	    }

	    public void showTransactions() {
	        System.out.println("Transaction History:");
	        for (String t : transactions) {
	            System.out.println(t);
	        }
	    }
}
