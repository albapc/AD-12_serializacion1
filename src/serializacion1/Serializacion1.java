package serializacion1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Alba
 */
public class Serializacion1 {

    //private static FileOutputStream fos;
    private static ObjectOutputStream oos;
//    private static FileInputStream fis;
    private static ObjectInputStream ois;

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        MClase object1 = new MClase("ola", -7, 2.7E10);

        //fos = new FileOutputStream("serial.dat");
//       oos = new ObjectOutputStream(fos);
        oos = new ObjectOutputStream(new FileOutputStream("serial.dat"));
        oos.writeObject(object1);
        System.out.println("object1: " + object1.toString());
        oos.close();
//       fos.close();

        MClase object2 = new MClase();

//       fis = new FileInputStream("serial.dat");
//       ois = new ObjectInputStream(fis);
        ois = new ObjectInputStream(new FileInputStream("serial.dat"));

        object2 = (MClase) ois.readObject();

        ois.close();
//       fis.close();

        System.out.println("object2: " + object2.toString());

    }

}
