package Memberinfo_Package;

import java.util.Scanner;

public class Member {
    private String name,id,pass,phone;

    public void setMemberInfo(){
        Scanner scn = new Scanner(System.in);

        System.out.print("이름을 입력하세요");
        this.name = scn.nextLine();
        System.out.print("아이디를 입력하세요");
        this.id = scn.nextLine();
        System.out.print("비밀번호를 입력하세요");
        this.pass = scn.nextLine();
        System.out.print("핸드폰번호 입력하세요");
        this.phone = scn.nextLine();
    }
    public void putMemberInfo(){
        System.out.println("name :" + name +" ID :" + id+" 비밀번호 :" + pass+" 핸드폰 :" + phone);
    }

    public String getMemberName() {
        return name;
    }

    public String getMemberId() {
        return id;
    }

    public String getMemberPass() {
        return pass;
    }

    public String getMemberPhone() {
        return phone;
    }
}
