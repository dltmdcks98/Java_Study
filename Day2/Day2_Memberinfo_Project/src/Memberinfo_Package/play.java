package Memberinfo_Package;

public class play {
    public static void main(String[] args) {
        //Member m = new Member(); //회원 정보 객체
        // 2명의 회원정보객체를 생성한 후 그것들을 객체배열에 저장해 준다.(Array)
        //객체배열(컨테이너)에 저장된것을 접그내서 정보저장/반환/출력을 한다.
        //즉 2명의 회원정보가 처리되어야함(반복문 사용 x)
        //=========================================
        Memberinfo_Package.Member m1 = new Memberinfo_Package.Member();
        Memberinfo_Package.Member m2 = new Memberinfo_Package.Member();
        Memberinfo_Package.Member m3 = new Memberinfo_Package.Member();
        Memberinfo_Package.Member[] m_box =new Memberinfo_Package.Member[3];//객체 배열 만들기
        // 반복문을 사용해서 처리하는 버전으로 바구어본다.
        //중요한건 m_box컨테이너 몇개가 저장되어있는지를 알아내는 속성이나 메서드가 있는가 하는 저밍다.
        //예를들어, m_box.length 라는 속성이 있다면 그것을 반복문에서 사용하도록 한다.


        //객체배열에 저장된 것들을 접근해서 정보저장/반환/출력을 해준다.
//        m_box[0] = m1;//첫번째 회원정보를 [0]번째 저장해준다
//        m_box[0].setMemberInfo();
//        String yourName = m_box[0].getMemberName();
//        System.out.println("너의 이름은 : "+yourName);
//        m_box[0].putMemberInfo();
//        
//        m_box[1] = m2;
//        m_box[1].setMemberInfo();
//        

        //=======================
        // 반복문 버전
        //=======================
        String tmpName=null;//반드시 초기화할것
        m_box[0]=m1;m_box[1]=m2;m_box[2]=m3;
        
        
        
        for(int idx=0; idx<m_box.length;idx++)
        {
        	m_box[idx].setMemberInfo();
        	tmpName = m_box[idx].getMemberName();
        	System.out.println("반환된 이름은" + tmpName);
        	m_box[idx].putMemberInfo();
        }
//        //정보저장
//        m.setMemberInfo();
//        m.getMemberName();
//        String tmpName=m.getMemberName();
//        String tmpId= m.getMemberId();
//        String tmpPass= m.getMemberPass();
//        String tmpPhone=m.getMemberPhone();
//        System.out.print(tmpName+" "+tmpId+" "+tmpPass+" "+tmpPhone);
//        m.putMemberInfo();
    }
}
