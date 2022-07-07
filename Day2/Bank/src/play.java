import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        ArrayList<customerInfo> m = new ArrayList<customerInfo>();
        customerInfo c, c1, c2 ;
        int menu = 0;




//sample data
        m.add(new customerInfo("aa","123123",5000));m.add(new customerInfo("bb","123444",5000));


        while (true) {
            //메뉴 구성
            System.out.println("menu");
            System.out.println("===================================================");
            System.out.println("1. info input ");
            System.out.println("2. out cash ");
            System.out.println("3. put cash ");
            System.out.println("4. search");
            System.out.println("5. view all 0info");
            System.out.println("6. clear");
            System.out.println("7. exit");
            System.out.println("==================================================");

            Scanner inputMenu = new Scanner(System.in);
            menu = inputMenu.nextInt();
            switch (menu) {
                case 1:
                    //사용자를 계속 넣을 수 있는 코드
                    while (true) {
                        try {
                            System.out.println("If you want exit input 'exit' in name space");
                            Scanner scn = new Scanner(System.in);
                            System.out.println("input name");
                            String name = scn.nextLine();
                            if (name.equals("exit")) throw new Exception();
                            System.out.println("input account");
                            String account = scn.nextLine();
                            System.out.println("input cash");
                            int cash = scn.nextInt();
                            c = new customerInfo(name, account, cash);
                            m.add(c);
                        } catch (Exception e) {
                            System.out.println("stop add info");
                            break;
                        }
                        break;
                    }
                break;
                case 2:
                    System.out.println("Enter account");
                    Scanner inaccout = new Scanner(System.in);
                    for (int idx = 0; idx < m.size(); idx++) {
                        if (m.get(idx).contains(String.valueOf(inaccout.nextInt()))) {
                            System.out.println("Enter Withdrawal");
                            Scanner inpCash = new Scanner(System.in);
                            m.get(idx).outCash(inpCash.nextInt());
                            System.out.println("success");
                            break;
                        } else System.out.println("fail");
                        break;

                    }
                    break;
                case 3:
                    System.out.println("Enter account");
                    Scanner ouAccout = new Scanner(System.in);
                    for (int idx = 0; idx < m.size(); idx++) {
                        if (m.get(idx).contains(String.valueOf(ouAccout.nextInt()))) {
                            System.out.println("Enter Deposit");
                            Scanner inpCash = new Scanner(System.in);
                            m.get(idx).putCash(inpCash.nextInt());
                            System.out.println("success");
                            break;
                        } else System.out.println("fail");
                        break;

                    }
                    break;
                case 4:
                    System.out.println("input search name or account");
                    Scanner input = new Scanner(System.in);
                    String info = input.nextLine();
                    for (int idx = 0; idx < m.size(); idx++) {
                        if (m.get(idx).contains(info)) {
                            System.out.println("success");
                            System.out.println("name : " + m.get(idx).name + " account : " + m.get(idx).account + " cash : " + m.get(idx).cash);
                            break;
                        } else System.out.println("fail");
                        break;

                    }
                case 5:
                    for (int idx = 0; idx < m.size(); idx++) {
                        System.out.println("name : "+m.get(idx).getName()+" accout : "+m.get(idx).getAccount()+" money : "+m.get(idx).getCash());
                    }
                    break;
                case 6:
                    try {
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        break;
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                case 7:
                    System.out.println("exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("again select menu");
                    break;
            }
        }
    }
}
