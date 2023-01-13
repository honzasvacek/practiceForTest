import java.util.concurrent.ThreadLocalRandom;

public class FordMustang extends Auto{
    int pocetKoni;

    public FordMustang(int emise, int pocetKol, int pocetKoni) {
        super(emise, pocetKol);
        this.pocetKoni = pocetKoni;
    }

    @Override
    public String toString() {
        return "FordMustang{" +
                "pocetKoni=" + pocetKoni +
                ", pocetKol=" + pocetKol +
                ", emise=" + emise +
                '}';
    }
}
