package org.lessons.java.shop;

public class Prodotto_incapsulated {
    private int codice;
    private String name;
    private String brand;
    private Float price;
    private Float iva;
    private Float priceWithIva;

    public Prodotto_incapsulated(String name, String brand, Float price, Float iva) {
        this.codice = (int) (Math.random() * 99999 + 1);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
        this.priceWithIva = null;
    }

    public Prodotto_incapsulated(String name, String brand) {
        this.codice = (int) (Math.random() * 99999 + 1);
        this.name = name;
        this.brand = brand;
        this.price = null;
        this.iva = null;
        this.priceWithIva = null;
    }

    public int getCode() {
        System.out.println(this.name + "'s codice is: " + this.codice);
        return this.codice;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        System.out.println("here's the name! " + this.name);
        return this.name;
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        }
    }

    public String getBrand() {
        System.out.println("here's the brand! " + this.brand);
        return this.brand;
    }

    public Float setPrice(Float price) {
        if (price > 0) {
            this.price = price;
        }
        return this.price;
    }

    public Float getPrice() {
        System.out.println(this.name + "'s price is: " + this.price + "$");
        return this.price;
    }

    public void setIva(Float iva) {
        if (iva > 0) {
            this.iva = iva;
        }
    }

    public Float getIva() {
        System.out.println(this.name + "'s iva is: " + this.iva);
        return this.iva;
    }

    public void calculateIvaPrice() {
        if (this.price != null && this.iva != null) {
            this.priceWithIva = this.price + this.price * this.iva;
            System.out.println(this.name + "'s price with IVA is: " + priceWithIva + "$");
        }

    }

    public Float getIvaPrice() {
        System.out.println(this.name + "'s price with iva is: " + this.priceWithIva);
        return this.priceWithIva;
    }

    public String getFullName() {
        System.out.println("here's the concatenated code-name: " + this.codice + "-" + this.name + "-" + brand);
        return this.codice + "-" + this.name;
    }

    public void getAllInfo() {
        this.getCode();
        this.getName();
        this.getBrand();
        this.getPrice();
        this.getIva();
        this.getIvaPrice();
    }
}
