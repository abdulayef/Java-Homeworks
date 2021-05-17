package eCommerce.entities.concretes;

public class User {

    int id;
    String firstName;
    String lastName;
    String eMail;
    String password;

    public User(int id, String firstName, String lastName, String eMail, String password) {
        this.id=id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPassword() {
        return password;
    }
}
