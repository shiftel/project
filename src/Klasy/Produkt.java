package Klasy;

abstract public class Produkt {
    private double cena;
    private String nazwa;
    private int ilosc_w_magazynie;
    private String opis;
    private String material;
    private String kolor;
    private Producent producent;

    public Produkt(double cena, String nazwa, int ilosc_w_magazynie, String opis, String material, String kolor, Producent producent) {
        this.cena = cena;
        this.nazwa = nazwa;
        this.ilosc_w_magazynie = ilosc_w_magazynie;
        this.opis = opis;
        this.material = material;
        this.kolor = kolor;
        this.producent = producent;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getIlosc_w_magazynie() {
        return ilosc_w_magazynie;
    }

    public void setIlosc_w_magazynie(int ilosc_w_magazynie) {
        this.ilosc_w_magazynie = ilosc_w_magazynie;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public boolean czyProduktDostępny () {
        if (this.ilosc_w_magazynie > 0) {
            return true;
        }
        else {return false;}
    }

}
