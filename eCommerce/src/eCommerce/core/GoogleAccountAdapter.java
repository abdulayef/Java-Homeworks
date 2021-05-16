package eCommerce.core;

import eCommerce.business.abstracts.AccountService;
import eCommerce.business.abstracts.UserService;
import eCommerce.googleService.GoogleAccountService;

public class GoogleAccountAdapter implements AccountService {

    String eMail;
    String password;

    public GoogleAccountAdapter(String eMail, String password) {
        this.eMail = eMail;
        this.password = password;
    }

    @Override
    public boolean registerIsValid() {
        return true;
    }

    @Override
    public boolean loginIsValid() {
        GoogleAccountService googleAccountService=new GoogleAccountService();
        if(!googleAccountService.checkAccount(eMail, password)) {
            System.out.println("Google hesabı bulunamadı");
            return false;
        }
        System.out.println("Başarıyla google hesabı ile giriş yapıldı");
        return true;
    }

}
