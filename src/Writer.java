import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Writer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Auto> arr = new ArrayList<Auto>();

        File file = new File("data.dat");

        for (int i = 0; i < 2; i++) {
            arr.add(new FiatMultipla(ThreadLocalRandom.current().nextInt(500),4,"Hovno"));
            arr.add(new FordMustang(ThreadLocalRandom.current().nextInt(700),4,860));
        }

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(arr);

        System.out.println(arr);

    }
}