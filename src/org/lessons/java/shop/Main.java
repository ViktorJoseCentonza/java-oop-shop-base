package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        Prodotto_incapsulated patatine = new Prodotto_incapsulated("patatine", "croccanti", 5.99f, 0.22f);
        patatine.calculateIvaPrice();
        patatine.getAllInfo();

        Prodotto_incapsulated prodottoSenzaPrezzo = new Prodotto_incapsulated("patatine", "croccanti");
        prodottoSenzaPrezzo.getAllInfo();
    }

}
