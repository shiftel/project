package Klasy;

import Płacenie.Płacenie_za_zakup;

import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    private double wartosc_zamowienia;
    private ArrayList<Produkt> listaProduktow;
    private Płacenie_za_zakup placenie;
    private String adres_dostawy;
    private String sposob_dostawy;


    public Koszyk() {
        this.listaProduktow = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        listaProduktow.add(produkt);
    }

    public void usunProdukt(Produkt produkt) {
        listaProduktow.remove(produkt);
    }

    public void ustawMetodePlatnosci(Płacenie_za_zakup placenie) {
        this.placenie = placenie;
    }

    public void zlozZamowienie() {
        double wartoscZamowienia = obliczWartoscZamowienia();
        System.out.println("Zamówienie na kwotę: " + wartoscZamowienia + " zł zostało złożone.");}

    public double obliczWartoscZamowienia() {
        double wartoscZamowienia = 0.0;
        for (Produkt produkt : listaProduktow) {
            wartoscZamowienia += produkt.getCena();
        }
        return wartoscZamowienia;
    }

    public List<Produkt> pobierzListeProduktow() {
        return listaProduktow;
    }


}
