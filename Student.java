import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    String firstName;
    Date dob;
    Address address;
    Student(String firstName, Date dob, Address address) {
        this.firstName = firstName;
        this.dob = dob;
        this.address = address;
    }
}
