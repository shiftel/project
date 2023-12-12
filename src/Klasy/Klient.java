package Klasy;

import Płacenie.Płacenie_za_zakup;
import java.util.List;
import java.text.DecimalFormat;
public class Klient implements Obserwator{

    private String imie;
    private String nazwisko;
    private Płacenie_za_zakup płacenie;
    private String login;
    private String numer_telefonu;
    private Koszyk koszyk;

    // Konstruktor, gettery, settery


    //public void setPaymentStrategy(Płacenie_za_zakup płacenie) {
        //this.płacenie = płacenie;}

    public Klient(String imie, String nazwisko,  String login,  String numer_telefonu) {

        this.login = login;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_telefonu = numer_telefonu;
        this.koszyk = new Koszyk();
    }

    //public Płacenie_za_zakup getPłacenie() {
        //return płacenie;}

    //public void setPłacenie(Płacenie_za_zakup płacenie) {
        //this.płacenie = płacenie;}

    public Klient() {}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNumer_telefonu() {
        return numer_telefonu;
    }

    public void setNumer_telefonu(String numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    public List<Produkt> sprawdzKoszyk() {
        return koszyk.pobierzListeProduktow();
    }

    public String obliczLacznaWartoscKoszyka() {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(koszyk.obliczWartoscZamowienia());
    }
    public void dodajProduktDoKoszyka(Produkt produkt) {
        koszyk.dodajProdukt(produkt);
    }

    public void usunProduktZKoszyka(Produkt produkt) {
        koszyk.usunProdukt(produkt);
    }

    public void powiadom(String wiadmosc) {
        System.out.println(this.imie + " " + this.nazwisko + " - " + wiadmosc);
    }
}
