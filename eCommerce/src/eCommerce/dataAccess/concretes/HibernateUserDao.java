package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HibernateUserDao implements UserDao {

    HashMap<String, User> getUser=new HashMap<String, User>();

    public HibernateUserDao() {
        User user=new User(1, "Ahmet", "Keskin", "ahmet@gmail.com", "sass");
        User user1=new User(2, "Mehmet", "Keskin", "mehmet@gmail.com", "sass");
        getUser.put(user1.geteMail(), user1);
        getUser.put(user.geteMail(), user);
    }

    @Override
    public void addToDatabase(User user) {
        getUser.put(user.geteMail(), user);
        System.out.println(user.getFirstName()+" İsimli üye veritabanına eklendi");
    }

    @Override
    public User getFromDataBase(String eMail) {
        return getUser.get(eMail);
    }

    @Override
    public void deleteFromDatabase(String eMail) {
        getUser.remove(eMail);
    }

    @Override
    public void updateFromDatabase(User user) {

    }
}
