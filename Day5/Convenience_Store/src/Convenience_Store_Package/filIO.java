package Convenience_Store_Package;

import java.io.*;
import java.util.ArrayList;

public class filIO  implements Serializable {
    public void fileInput(ArrayList m ) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\temp\\infoDB.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(m);
        objectOutputStream.close();
    }
    public void fileOutput(ArrayList m) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D:\\temp\\infoDB.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object o = objectInputStream.readObject();
        ArrayList<Product> arrayList = (ArrayList<Product>) o;
        System.out.println(arrayList.size());
    }
}
