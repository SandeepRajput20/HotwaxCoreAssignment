import java.io.Serializable;

public class Address implements Serializable {
    String city;
    String state;
    int pincode;
    String country;
    Address(String city, String state,int pincode, String country) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.country = country;
    }
}
