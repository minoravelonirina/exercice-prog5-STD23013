package com.example.demo.practice;

public class Card {
    private double weight;
    private double amount;

    public Card(double weight, double amount) {
        this.weight = weight;
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
