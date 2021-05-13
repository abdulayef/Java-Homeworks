package entities;

import java.time.LocalDate;

public class Gamer {

    int id;
    String firstName;
    String lastName;
    String nationalityID;
    LocalDate dateOfBirth;

    public Gamer(int id, String firstName, String lastName, String nationalityID, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityID = nationalityID;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationalityID() {
        return nationalityID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
