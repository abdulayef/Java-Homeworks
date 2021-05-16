package eCommerce.business.concretes;

import eCommerce.business.abstracts.AccountService;
import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.UserService;
import eCommerce.entities.concretes.User;

public class AuthManager implements AuthService {

    UserService userService;
    AccountService accountService;

    public AuthManager(UserService userService, AccountService accountService) {
        this.userService = userService;
        this.accountService = accountService;
    }

    @Override
    public void register(User user) {
        if(accountService.registerIsValid()) {
            userService.add(user);
        }
    }

    @Override
    public void login() {
        if(accountService.loginIsValid()){

        }

    }
}
