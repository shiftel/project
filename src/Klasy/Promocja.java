package Klasy;

import java.util.ArrayList;
import java.util.List;

public class Promocja implements Podmiot{
    private ArrayList<Obserwator> obserwatorzy;
    public Promocja() {
        obserwatorzy = new ArrayList<>();
    }

    public void powiadom() {
        for (Obserwator klient : obserwatorzy) {
            ((Klient) klient).powiadom("Powiadomienie o promocji");
        }
    }

    @Override
    public void dodaj(Obserwator klient) {
        obserwatorzy.add(klient);
    }

    @Override
    public void usunZInformowaniaDoPromocji(Obserwator klient) {
        obserwatorzy.remove(klient);
    }

    public void ustawPromocjeNaProdukty(List<Produkt> produkty, double znizka) {
        for (Produkt produkt: produkty) {
            produkt.setCena(produkt.getCena()*(1-znizka));
        }
    }
}
