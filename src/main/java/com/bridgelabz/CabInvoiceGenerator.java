package com.bridgelabz;
public class CabInvoiceGenerator {
    private static final int MINIMUM_COST_PER_KILOMETER = 10;
    private static final int COST_PER_TIME = 1;
    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {

            totalFare += this.calculateFare(ride.getDistance(), ride.getTime());
        }
        return totalFare;
    }
    public static double calculateFare(double distance, int time) {

        return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to cab invoice generator program");
        System.out.println("Fare Value is:" +calculateFare(2.0, 5));
    }
}