import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Reader {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        File file = new File("data.dat");

        ArrayList<Auto> arr;

        if(file.exists()) {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            arr = (ArrayList<Auto>)ois.readObject();
            ois.close();
        } else {
            arr = new ArrayList<Auto>();
        }

        Collections.sort(arr);

        System.out.println(arr);
    }
}
