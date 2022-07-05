import javax.naming.event.ObjectChangeListener;
import java.util.Scanner;

public class customerInfo {
    String name, account;
    int cash;

    public customerInfo(String name, String account, int cash) {
        this.name = name;
        this.account = account;
        this.cash = cash;
    }

    public void putCash(){
        int Icash;
        Scanner putcash = new Scanner(System.in);
        Icash = putcash.nextInt();
        if(Icash<0){
            System.out.println("Input upper 0");
        }else {
            this.cash += Icash;
            System.out.println(this.cash);
        }
    }
    public void outCash(){
        int Ocash;
        Scanner outcash = new Scanner(System.in);
        Ocash = outcash.nextInt();
        if(Ocash>this.cash){
            System.out.println("Input under cash");
        }else {
            this.cash -= Ocash;
            System.out.println(this.cash);
        }
    }
    public int cash(){
        return this.cash;
    }

    public void putCustomerinfo(){
        System.out.print("name : "+this.name);
        System.out.print(" account : "+this.account);
        System.out.println(" cash : "+this.cash);
    }

    public boolean contains(String o){
        if(o.equals(name)||o.equals(account)){
            return true;
        }else return false;
    }


}
