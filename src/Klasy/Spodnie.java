package Klasy;

public class Spodnie extends Produkt{
    private String rozmiar;
    private byte dlugosc_spodni;
    private String typSpodni;

    public Spodnie(double cena, String nazwa, int ilosc_w_magazynie, String opis, String material, String kolor, Producent producent, String rozmiar, byte dlugosc_spodni, String typSpodni) {
        super(cena, nazwa, ilosc_w_magazynie, opis, material, kolor, producent);
        this.rozmiar = rozmiar;
        this.dlugosc_spodni = dlugosc_spodni;
        this.typSpodni = typSpodni;
    }

    public String getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(String rozmiar) {
        this.rozmiar = rozmiar;
    }

    public byte getDlugosc_spodni() {
        return dlugosc_spodni;
    }

    public void setDlugosc_spodni(byte dlugosc_spodni) {
        this.dlugosc_spodni = dlugosc_spodni;
    }

    public String getTypSpodni() {
        return typSpodni;
    }

    public void setTypSpodni(String typSpodni) {
        this.typSpodni = typSpodni;
    }
}
