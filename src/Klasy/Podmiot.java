package Klasy;

public interface Podmiot {
    void dodaj(Obserwator klient);
    void usunZInformowaniaDoPromocji(Obserwator klient);
    void powiadom();
}
