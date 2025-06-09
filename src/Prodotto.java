public class Prodotto {
    int codice;
    String nome;
    String descrizione;
    Float prezzo;
    Float iva = 0.22f;

    public Prodotto(String nome, String descrizione, Float prezzo) {
        this.codice = (int) (Math.random() * 99999 + 1);
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = prezzo += prezzo * iva;
    }

    public void getPrice() {
        System.out.println(this.nome + "'s price is: " + this.prezzo + "$");
    }

    public void getIva() {
        System.out.println(this.nome + "'s price with IVA is: " + this.iva + "$");
    }

    public void getFullName() {
        System.out.println("here's the concatenated code-name: " + this.codice + "-" + this.nome);
    }

    public void getAllInfo() {
        this.getPrice();
        this.getIva();
        this.getFullName();
    }

    public static void main(String[] args) {
        Prodotto patatine = new Prodotto("patatine", "croccanti", 5.99f);

        Prodotto pasta = new Prodotto("pasta", "rugosa", 2.19f);

        patatine.getAllInfo();
        pasta.getAllInfo();
    }
}
