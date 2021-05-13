package entities;

import java.time.LocalDate;

public class Customer {

    public int id;
    public String firstName;
    public String lastName;
    public LocalDate dateOfBirth;
    public String NationalityId;

    public Customer(int id, String firstName, String lastName, String nationalityId, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        NationalityId = nationalityId;
    }

}
