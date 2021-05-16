package eCommerce.business.abstracts;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public interface AccountService {

    boolean registerIsValid();
    boolean loginIsValid();

}
