package eCommerce.dataAccess.abstracts;

import eCommerce.entities.concretes.User;

public interface UserDao {

    void addToDatabase(User user);
    User getFromDatabase(String eMail);

}
