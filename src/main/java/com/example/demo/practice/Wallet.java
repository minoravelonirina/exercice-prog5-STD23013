package com.example.demo.practice;

import com.example.demo.practice.Card;

import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private String color;
    private boolean porteCarte;
    private double weight;
    private String brand;

    private List<Card> cards = new ArrayList<>();

    public Wallet(String color, boolean porteCarte, double weight, String brand) {
        this.color = color;
        this.porteCarte = porteCarte;
        this.weight = weight;
        this.brand = brand;
    }

    public double getMoney() {
        return cards.stream()
                .mapToDouble(Card::getAmount)
                .sum();
    }

    public double checkMoney() {
        return getMoney();
    }

    public void addMoney(Card card, double amount) {
        if (amount > 0 && cards.contains(card)) {
            card.setAmount(card.getAmount() + amount);
        }
    }

    public void addCard(Card card) {
        if (!porteCarte) {
            System.out.println("Ce portefeuille ne supporte pas les cartes !");
            return;
        }
        cards.add(card);
        weight += card.getWeight();
    }

    public void lostMoney(Card card, double amount) {
        if (amount > 0 && cards.contains(card)) {
            double newAmount = Math.max(0, card.getAmount() - amount);
            card.setAmount(newAmount);
        }
    }

    public List<Card> getCards() {
        return cards;
    }
}
