package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

import java.util.HashMap;

public class UserManager implements UserService {

    public HashMap<Integer, User> allUsers = new HashMap<Integer, User>();

    UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        if(get(user.geteMail())==null){
            userDao.addToDatabase(user);
        }else{
            System.out.println("Bu kullanıcı zaten kayıtlı");
        }
    }

    public User get(String eMail) {
        return userDao.getFromDataBase(eMail);
    }



}
