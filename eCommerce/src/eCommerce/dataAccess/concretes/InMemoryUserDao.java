package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserDao implements UserDao {

    List<User> users = new ArrayList<User>();

    public InMemoryUserDao() {
        users.add(new User(1, "Birol", "ÖZTÜRK", "test@gmail.com", "birol1234"));
    }

    @Override
    public void addToDatabase(User user) {
        users.add(user);
    }

    @Override
    public User getFromDatabase(String eMail) {
        User resultUser = users.stream().filter(user -> user.geteMail().equals(eMail)).findFirst().orElse(null);
        return resultUser;

    }
}
