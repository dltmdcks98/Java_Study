import java.util.ArrayList;
import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        ArrayList<customerInfo> m = new ArrayList<>();
        customerInfo c1 = new customerInfo("a","1231234",1000);
        customerInfo c2 = new customerInfo("b","14441555",100000);

        m.add(c1);
        m.add(c2);

        for(int i=0; i<m.size(); i++){
            m.get(i).putCustomerinfo();
        }
     System.out.println("custom1 outCash");
        m.get(0).outCash();

        Scanner input = new Scanner(System.in);
        String info = input.nextLine();
        if(m.contains(info)){
            System.out.println("success");
        }else System.out.println("fail");



    }
}
