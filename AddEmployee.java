import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AddEmployee {
    String employee_name;
    String employee_email;
    int employee_age;
    String employee_dob;
    Scanner scanner = new Scanner(System.in);
    File file = new File("employee.txt");
    ArrayList<Employee> employees = new ArrayList<>();
    ObjectOutputStream objectOutputStream;
    ObjectInputStream objectInputStream;
    ListIterator listIterator;

     void addEmployee() throws Exception
     {


     }
}
