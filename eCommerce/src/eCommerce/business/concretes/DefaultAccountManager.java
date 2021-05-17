package eCommerce.business.concretes;

import eCommerce.business.abstracts.AccountService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.utils.Utils;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class DefaultAccountManager implements AccountService {

    String eMail;
    String password;
    UserService userService;

    public DefaultAccountManager(String eMail, String password, UserService userService) {
        this.eMail = eMail;
        this.password = password;
        this.userService=userService;
    }

    @Override
    public boolean signIn() {
        if(!Utils.checkEmail(eMail)){
            System.out.println("Geçerli bir e-posta adresi girmelisiniz");
        }
        if(password.length()<2){
            System.out.println("Şifre en az 6 karakter olmalıdır");
        }
        else if(userService.get(eMail)==null){
            System.out.println("Böyle bir kullanıcı bulunamadı");
        }else if(!userService.get(eMail).getPassword().equals(password)){
            System.out.println("Hatalı bir şifre girdiniz");
        }
        else{
            System.out.println("Başarıyla giriş yaptınız");
            return true;
        }
        return false;
    }
}
