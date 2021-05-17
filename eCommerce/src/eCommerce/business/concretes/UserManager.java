package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

    UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        System.out.println(user.getFirstName()+" İsimli kullanıcı veritabanına eklendi");
        userDao.addToDatabase(user);
    }

    @Override
    public User get(String eMail){
        return userDao.getFromDatabase(eMail);
    }
}
