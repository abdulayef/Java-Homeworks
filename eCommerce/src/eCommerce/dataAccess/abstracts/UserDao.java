package eCommerce.dataAccess.abstracts;

import eCommerce.entities.concretes.User;

import java.util.List;

public interface UserDao {

    void addToDatabase(User user);
    User getFromDataBase(String eMail);
    void deleteFromDatabase(String eMail);
    void updateFromDatabase(User user);

}
