import java.io.Serializable;

public class Employee implements Serializable {
    String ename;
    String emaiID;
    int age;
    String dob;

    public Employee(String ename, String emaiID, int age, String dob) {
        this.ename = ename;
        this.emaiID = emaiID;
        this.age = age;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "ename='" + ename + '\'' +
                ", emaiID='" + emaiID + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' ;
    }
}
