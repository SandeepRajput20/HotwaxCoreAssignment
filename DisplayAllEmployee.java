import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class DisplayAllEmployee {

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

    void displayAll() throws Exception{

        if (file.isFile()) {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            employees = (ArrayList<Employee>) objectInputStream.readObject();
            objectInputStream.close();

            listIterator = employees.listIterator();
            while (listIterator.hasNext()) {
                System.out.println(listIterator.next());
            }
        } else {
            System.out.println("File Does Not Exists....");
        }
    }
}
