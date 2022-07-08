package Convenience_Store_Package;

import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class play {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        FileOutputStream fileOutputStream = new FileOutputStream("D:\\temp\\infoDB.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        ArrayList<Product> m = new ArrayList<>();
        Product c = null;

        c = new Product(1,"coffee",1000,5,"23.05.01");
        m.add(c);
        c = new Product(2,"snak",500,7,"23.05.01");
        m.add(c);

        fileInput(m);
        fileOutput(m);

//        objectOutputStream.writeObject(m);
//        objectOutputStream.close();
//
//        FileInputStream fileInputStream = new FileInputStream("D:\\temp\\infoDB.txt");
//        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//        Object o = objectInputStream.readObject();
//        ArrayList<Product> arrayList = (ArrayList<Product>) o;
//         System.out.println(arrayList.size());


    }



    public static void fileInput(ArrayList<Product> m ) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\temp\\infoDB.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(m);
        objectOutputStream.close();
    }
    public static void fileOutput(ArrayList<Product> m) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D:\\temp\\infoDB.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Object o = objectInputStream.readObject();
        ArrayList<Product> arrayList = (ArrayList<Product>) o;
        System.out.println(arrayList.size());
    }
}

