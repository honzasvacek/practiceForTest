public class FiatMultipla extends Auto{
    String osklivost;

    public FiatMultipla(int emise, int pocetKol, String osklivost) {
        super(emise, pocetKol);
        this.osklivost = osklivost;
    }

    @Override
    public String toString() {
        return "FiatMultipla{" +
                "osklivost='" + osklivost + '\'' +
                ", pocetKol=" + pocetKol +
                ", emise=" + emise +
                '}';
    }
}
