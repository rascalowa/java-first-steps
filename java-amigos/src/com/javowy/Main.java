package com.javowy;

public class Main {
    public static float countAnnual(float monthlyFee) {
        return monthlyFee * 12;
    }

    public static float countRentalYield(float annualRentalIncome, float propertyPrice) {
        float income = annualRentalIncome / propertyPrice;
        return income * 100;
    }

    public static void main(String[] args) {
        float rentalIncome = 1300;
        float propertyPrice = 250_000;
        float annualRentalIncome = countAnnual(rentalIncome);
        float rentalYield = countRentalYield(annualRentalIncome, propertyPrice);

        System.out.println(rentalYield);
    }
}