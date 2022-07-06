import java.util.ArrayList;
import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        ArrayList<customerInfo> m = new ArrayList<>();
        customerInfo c =null;
/*
customerInfo b = null
for(int idx=0;idx<m.size();idx++){ -> m.size()를 사용하게 되면 런타임이나 아웃오브바운드가 생길 수 있다. 대안 while+break
b= new customerInfo();
}
 */
        while(true){
            try{
                System.out.println("If you want exit input 'exit' in name space");
                Scanner scn = new Scanner(System.in);
                System.out.println("input name");
                String name = scn.nextLine();
                if(name.equals("exit")) throw new Exception();
                System.out.println("input account");
                String account = scn.nextLine();
                System.out.println("input cash");
                int cash = scn.nextInt();
                c = new customerInfo(name, account, cash);
                m.add(c);
            }catch (Exception e){
                System.out.println("stop add info");
                break;
            }
        }
        System.out.println("input search name or account");
        Scanner input = new Scanner(System.in);
        String info = input.nextLine();
        for(int idx=0; idx < m.size(); idx++){
            if(m.get(idx).contains(info)){
                System.out.println("success");
                System.out.println("name : " +m.get(idx).name+" account : "+m.get(idx).account+" cash : "+m.get(idx).cash);
                break;
            }else System.out.println("fail"); break;
        }

        System.out.println("input search cash");
        Scanner search = new Scanner(System.in);
        System.out.println("Input minimal range");
        int inpUpper = search.nextInt();
        System.out.println("Input max range");
        int inpUnder = search.nextInt();

        for(int idx=0; idx<m.size();idx++){
            if(m.get(idx).range(inpUpper,inpUnder)) System.out.println(m.get(idx).name);
                else System.out.println("not info in range");
        }



    }


}
