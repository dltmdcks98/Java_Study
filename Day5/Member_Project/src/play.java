import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class play {
    public static void main(String[] args) {
        Member member = new Member();
        ArrayList<Member> list = new ArrayList<>();




    }
    public static void fileInput(ArrayList<M> m ) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\temp\\store.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

        objectOutputStream.writeObject(m);
        objectOutputStream.close();
    }
}
