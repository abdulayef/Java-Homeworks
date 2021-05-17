package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

public interface AuthService {

    void login();
    void register(User user);

}
