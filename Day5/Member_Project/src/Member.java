public class Member {
    boolean sex;
    String address;
    int age;

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class addMember extends Member{
    public addMember(boolean sex, String address, int age) {
        super.sex = sex;
        super.address = address;
        super.age = age;
    }
}
