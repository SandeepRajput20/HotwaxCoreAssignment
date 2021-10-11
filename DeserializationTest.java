import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


    FileInputStream  fileInputStream=new FileInputStream("output1.ser");
    ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
    Student student=(Student)objectInputStream.readObject();

    System.out.println(student.firstName+"\t"+student.dob+"\t"+student.address.city+"\t"+student.address.state+"\t"+student.address.pincode+"\t"+student.address.country);
}
}
