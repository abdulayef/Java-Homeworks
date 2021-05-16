package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface UserService {

    void add(User user);
    User get(String eMail);
}
