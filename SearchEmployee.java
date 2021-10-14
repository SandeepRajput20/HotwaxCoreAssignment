import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;

public class SearchEmployee {

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

    void searchEmployee() throws Exception{
        if (file.isFile()) {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            employees = (ArrayList<Employee>) objectInputStream.readObject();
            objectInputStream.close();

            boolean found = false;
            System.out.println("Enter Employee Name/DOB/Email :");
            String searchEmployee = scanner.next();
            listIterator = employees.listIterator();
            while (listIterator.hasNext()) {
                Employee e = (Employee) listIterator.next();
                if ((e.ename).equals(searchEmployee)||(e.emaiID).equals(searchEmployee)||(e.dob).equals(searchEmployee)) {
                    System.out.println(e);
                    found = true;
                }
            }
            if (!found)
                System.out.println("Data Not Found");
        } else {
            System.out.println("File Not Exists...");
        }
    }
}
