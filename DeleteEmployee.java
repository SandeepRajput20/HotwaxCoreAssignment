import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Scanner;

public class DeleteEmployee {

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

        void delete() throws Exception
        {
            if (file.isFile()) {
                objectInputStream = new ObjectInputStream(new FileInputStream(file));
                employees = (ArrayList<Employee>) objectInputStream.readObject();
                objectInputStream.close();

                boolean found = false;
                System.out.println("Enter Employee Name for Delete :");
                employee_name = scanner.next();

                listIterator = employees.listIterator();
                while (listIterator.hasNext()) {
                    Employee e = (Employee) listIterator.next();
                    if (Objects.equals(e.ename, employee_name)) {
                        listIterator.remove();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Data Not Found");
                } else {
                    objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
                    objectOutputStream.writeObject(employees);
                    objectOutputStream.close();
                    System.out.println("Data Delete Successfully....");
                }
            } else {
                System.out.println("File Not Exists...");
            }
        }
        }
