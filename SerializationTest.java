import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String name=sc.next();
        System.out.println("Enter Date Of Birth(yyyy/MM/dd) : ");
        String dob=sc.next();
        System.out.println("Enter city : ");
        String city=sc.next();
        System.out.println("Enter State : ");
        String state=sc.next();
        System.out.println("Enter PinCode : ");
        int pincode=sc.nextInt();
        System.out.println("Enter Country : ");
        String country=sc.next();

        Date dateofbirth=new SimpleDateFormat("yyyy/MM/dd").parse(dob);

//        Student student=new Student(name,dob,new Address(city,state,pincode,country));
        Student student=new Student(name,dateofbirth,new Address(city,state,pincode,country));

        FileOutputStream fileOutputStream=new FileOutputStream("output2.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
    }
}
