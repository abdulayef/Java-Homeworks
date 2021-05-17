package eCommerce.core;

import eCommerce.business.abstracts.AccountService;
import eCommerce.googleService.GoogleAccountService;

public class GoogleAccountAdapter implements AccountService {

    GoogleAccountService googleAccountService;
    String eMail;
    String password;

    public GoogleAccountAdapter(String eMail, String password) {
        this.eMail = eMail;
        this.password = password;
    }

    @Override
    public boolean signIn() {
        googleAccountService=new GoogleAccountService();
        System.out.println("Google hesabınız ile başarıyla giriş yaptınız");
        return googleAccountService.accountIsValid(eMail, password);
    }
}
