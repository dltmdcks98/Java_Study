import java.util.ArrayList;
import java.util.Scanner;

public class play {
    public static void main(String[] args) {
        ArrayList<customerInfo> m = new ArrayList<>();
        customerInfo c =null;
        int idx = 0;
/*
customerInfo b = null
for(int idx=0;idx<m.size();idx++){ -> m.size()를 사용하게 되면 런타임이나 아웃오브바운드가 생길 수 있다. 대안 while+break
b= new customerInfo();
}
 */
        while(true){
            try{
                System.out.println("정보를 입력하세요");
                Scanner scn = new Scanner(System.in);
                String name = scn.nextLine();
                if(name.equals("exit")) throw new Exception();
                String account = scn.nextLine();
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
        for(idx=0; idx < m.size(); idx++){
            if(m.get(idx).contains(info)){
                System.out.println("success"); break;
            }else System.out.println("fail"); break;
        }




    }


}
