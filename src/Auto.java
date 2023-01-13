import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

public class Auto implements Serializable, Comparable<Auto>{
    int pocetKol;
    int emise;

    public Auto(int emise, int pocetKol) {
        this.emise = emise;
        this.pocetKol = pocetKol;
    }

    @Override
    public int compareTo(Auto a) {
        if (emise < a.emise) {
            return 1;
        }
        if (emise > a.emise) {
            return -1;
        }
        return 0;
    }
}
