package eCommerce.core;

import eCommerce.appleService.AppleAccountService;
import eCommerce.business.abstracts.AccountService;
import eCommerce.business.abstracts.UserService;

public class AppleAccountAdapter implements AccountService {

    String appleID;
    String password;

    public AppleAccountAdapter(String appleID, String password) {
        this.appleID = appleID;
        this.password = password;
    }

    @Override
    public boolean registerIsValid() {
        return false;
    }

    @Override
    public boolean loginIsValid() {
        AppleAccountService appleAccountService=new AppleAccountService();
        return appleAccountService.checkAccount(appleID, password);
    }
}
