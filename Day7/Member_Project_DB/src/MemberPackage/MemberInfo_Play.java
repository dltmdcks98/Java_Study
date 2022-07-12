package MemberPackage;

import java.io.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberInfo_Play {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      Scanner input = new Scanner(System.in);
      MemberInfo_Class memberInfo = new MemberInfo_Class();



        //메뉴 구성
        System.out.println("menu");
        System.out.println("===================================================");
        System.out.println("1. info input ");
        System.out.println("2. Read MemberPackage.Member ");
        System.out.println("3. Print MemberPackage.Member ");
        System.out.println("==================================================");

        while(true){
            switch (Integer.parseInt(input.nextLine())){
                case 1 :
                    System.out.print("Enter name : ");
                    memberInfo.setM_name(input.nextLine());

                    System.out.print("Enter phone : ");
                    memberInfo.setM_phone(input.nextLine());

                    System.out.print("Enter id : ");
                    memberInfo.setM_id(input.nextLine());

                    System.out.print("Enter pw : ");
                    memberInfo.setM_pw(input.nextLine());

                    memberInfo.insertSQL();
                    break;
                case 2:
                    break;
                case 3 :
                    break;
                default:
                    System.err.println("Error");
                    continue;
            }
        }
    }
}
