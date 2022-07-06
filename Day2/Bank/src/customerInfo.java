import javax.naming.event.ObjectChangeListener;
import java.util.Scanner;

public class customerInfo {
    static String name, account;
    static int cash;

    public customerInfo(String name, String account, int cash) {
        this.name = name;
        this.account = account;
        this.cash = cash;
    }

    public  void putCash(){
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
    public  void outCash(){
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


    public boolean contains(String o){
        if(o.equals(name)||o.equals(account)){
            return true;
        }else return false;
    }

    public boolean range(int upper,int under){
        if(upper < cash && cash<under){
            System.out.println("Success");
            return true;
        }else  return false;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        customerInfo.name = name;
    }

    public static String getAccount() {
        return account;
    }

    public static void setAccount(String account) {
        customerInfo.account = account;
    }

    public static int getCash() {
        return cash;
    }

    public static void setCash(int cash) {
        customerInfo.cash = cash;
    }
}
