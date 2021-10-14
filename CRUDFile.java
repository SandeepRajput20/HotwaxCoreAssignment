import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.*;

public class CRUDFile{
    public static void main(String[] args) throws Exception {
        int choice = -1;
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
        if (file.isFile()) {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            employees = (ArrayList<Employee>) objectInputStream.readObject();
            objectInputStream.close();
        }
        do {
            System.out.println("1.Add Empolyee");
            System.out.println("2.Display All Employee");
            System.out.println("3.Search Employee");
            System.out.println("4.Delete Employee");
            System.out.println("5.Exit");

            System.out.println("Enter Your Choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Employee Name : ");
                    employee_name = scanner.next();
                    System.out.println("Enter Employee Email : ");
                    employee_email = scanner.next();
                    System.out.println("Enter Employee Age : ");
                    employee_age = scanner.nextInt();
                    System.out.println("Enter Employee Date Of Birth(dd/MM/yyyy) : ");
                    employee_dob = scanner.next();

                    employees.add(new Employee(employee_name, employee_email, employee_age, employee_dob));
                    objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                    objectOutputStream.writeObject(employees);
                    objectOutputStream.close();

                    break;
                case 2:
                    DisplayAllEmployee displayAllEmployee = new DisplayAllEmployee();
                    displayAllEmployee.displayAll();
                    break;
            case 3:
                SearchEmployee searchEmployee = new SearchEmployee();
                searchEmployee.searchEmployee();
                break;
                case 4:
                    DeleteEmployee deleteEmployee = new DeleteEmployee();
                    deleteEmployee.delete();
                    break;
                case 5:
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice....");

            }
        }
            while (choice != 0) ;

    }
}
