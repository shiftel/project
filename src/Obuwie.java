public class Obuwie extends Produkt{
    private byte rozmiar;
    private String typObuwia;
    private String typPodeszwy;

    public Obuwie(double cena, String nazwa, int ilosc_w_magazynie, String opis, String material, String kolor, Producent producent, byte rozmiar, String typObuwia, String typPodeszwy) {
        super(cena, nazwa, ilosc_w_magazynie, opis, material, kolor, producent);
        this.rozmiar = rozmiar;
        this.typObuwia = typObuwia;
        this.typPodeszwy = typPodeszwy;
    }

    public byte getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(byte rozmiar) {
        this.rozmiar = rozmiar;
    }

    public String getTypObuwia() {
        return typObuwia;
    }

    public void setTypObuwia(String typObuwia) {
        this.typObuwia = typObuwia;
    }

    public String getTypPodeszwy() {
        return typPodeszwy;
    }

    public void setTypPodeszwy(String typPodeszwy) {
        this.typPodeszwy = typPodeszwy;
    }
}
