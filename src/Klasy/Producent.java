package Klasy;

public class Producent {
    private String marka;
    private String kraj_pochodzenia;

    public Producent(String marka, String kraj_pochodzenia) {
        this.marka = marka;
        this.kraj_pochodzenia = kraj_pochodzenia;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKraj_pochodzenia() {
        return kraj_pochodzenia;
    }

    public void setKraj_pochodzenia(String kraj_pochodzenia) {
        this.kraj_pochodzenia = kraj_pochodzenia;
    }

    @Override
    public String toString() {
        return "Producent: " + marka + ", kraj pochodzenia: '" + kraj_pochodzenia;
    }
}
