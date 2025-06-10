package org.lessons.java.shop;

public class Prodotto {
    int codice;
    String nome;
    String descrizione;
    Float prezzo;
    Float iva;

    public Prodotto(String nome, String descrizione, Float prezzo, Float iva) {
        this.codice = (int) (Math.random() * 99999 + 1);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Float getPrice() {
        System.out.println(this.nome + "'s price is: " + this.prezzo + "$");
        return this.prezzo;
    }

    public Float getIva() {
        if (this.prezzo != null && this.iva != null) {
            Float prezzoIvato = this.prezzo += this.prezzo * this.iva;
            System.out.println(this.nome + "'s price with IVA is: " + prezzoIvato + "$");
            return prezzoIvato;
        }
        return null;

    }

    public String getFullName() {
        System.out.println("here's the concatenated code-name: " + this.codice + "-" + this.nome);
        return this.codice + "-" + this.nome;
    }

    public void getAllInfo() {
        this.getPrice();
        this.getIva();
        this.getFullName();
    }

    public static void main(String[] args) {
        Prodotto patatine = new Prodotto("patatine", "croccanti", 5.99f, 0.22f);

        Prodotto pasta = new Prodotto("pasta", "rugosa", 2.19f, 0.11f);

        patatine.getAllInfo();
        pasta.getAllInfo();
    }
}
