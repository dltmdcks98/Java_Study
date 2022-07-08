package Convenience_Store_Package;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Scanner;

public class play {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ArrayList<Product> m = new ArrayList<>();
        Product c = null;

        //sample data
        c = new Product(1,"coffee",1000,5,"23.05.01");
        m.add(c);
        c = new Product(2,"snak",500,7,"23.05.01");
        m.add(c);

        //INPUT DATA
        Scanner input = new Scanner(System.in);
        int serial_no;
        String name;
        int price;
        int quantity;
        String expired;

        for(int idx =0; idx<3; idx++){
            System.out.println("Serial No");
            serial_no = Integer.parseInt(input.nextLine());
            System.out.println("Name");
            name = input.nextLine();
            System.out.println("Price");
            price = Integer.parseInt(input.nextLine());
            System.out.println("Quantity");
            quantity = Integer.parseInt(input.nextLine());
            System.out.println("Expired");
            expired = input.nextLine();

            c = new Product(serial_no,name,price,quantity,expired);
            m.add(c);
        }


        fileInput(m);
        fileOutput(m);
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
        for(int idx=0; idx < arrayList.size(); idx++){
            System.out.println(arrayList.get(idx).toString());
        }
    }
}

