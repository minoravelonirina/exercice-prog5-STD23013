package com.example.demo;

import com.example.demo.practice.Card;
import com.example.demo.practice.Wallet;

public class WalletTest {

    public static void main(String[] args) {

        // 1. Création des cartes
        Card c1 = new Card(10, 5000);   // 5000 Ar
        Card c2 = new Card(8, 10000);   // 10000 Ar

        // 2. Création d’un portefeuille qui supporte les cartes
        Wallet w = new Wallet("Noir", true, 100, "Gucci");

        // 3. Ajout des cartes
        w.addCard(c1);
        w.addCard(c2);

        // 4. Test getMoney()
        System.out.println("Total argent : " + w.getMoney()); // 15000

        // 5. Test addMoney()
        w.addMoney(c1, 2000);
        System.out.println("Carte 1 après ajout argent : " + c1.getAmount()); // 7000

        // 6. Test lostMoney()
        w.lostMoney(c2, 3000);
        System.out.println("Carte 2 après perte argent : " + c2.getAmount()); // 7000

        // 7. Test checkMoney()
        System.out.println("Check money : " + w.checkMoney()); // 7000 + 7000 = 14000
    }
}
