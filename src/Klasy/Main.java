package Klasy;

import Płacenie.PłacenieBlikiem;
import Płacenie.PłacenieKartą;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Klient k1 = new Klient("Jan", "Kowalski", "jan.kowalski@gmail.com", "12393804"  );
        Klient k2 = new Klient("Michał", "Nowak", "maskddaa", "12391223"  );
        SystemLogowania.dodaj(k1);
        SystemLogowania.dodaj(k2);
        Producent producent1 = new Producent("Nike", "Thailand");
        Producent producent2 = new Producent("Adidas", "Bangladesh");

        Obuwie obuwie1 = new Obuwie(149.99, "Buty sportowe", 50, "Buty do biegania", "Materiał", "Czerwony", producent1, (byte) 42, "Sneakers", "Gumowa");
        Obuwie obuwie2 = new Obuwie(99.99, "Trampki", 30, "Lekkie buty casualowe", "Inny materiał", "Czarny", producent2, (byte) 39, "Casual", "Tworzywo sztuczne");
        Obuwie obuwie3 = new Obuwie(199.99, "Buty trekkingowe", 20, "Buty na dłuższe wycieczki", "Gore-Tex", "Zielony", producent1, (byte) 44, "Trekking", "Poliuretan");

        ArrayList<Produkt> dopromocji = new ArrayList<>();
        dopromocji.add(obuwie1);

        k1.dodajProduktDoKoszyka(obuwie1);
        k1.dodajProduktDoKoszyka(obuwie2);

        Promocja promocja = new Promocja();
        promocja.dodaj(k1);

        Promocja promocja_swiateczna = new Promocja();
        promocja_swiateczna.powiadom();
        promocja_swiateczna.ustawPromocjeNaProdukty(dopromocji, 0.2);

        System.out.println(k1.obliczLacznaWartoscKoszyka());
    }
}