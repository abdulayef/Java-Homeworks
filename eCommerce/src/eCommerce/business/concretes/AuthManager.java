package eCommerce.business.concretes;

import eCommerce.business.abstracts.AccountService;
import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.EmailService;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.utils.Utils;
import eCommerce.entities.concretes.User;

import javax.script.ScriptContext;
import java.util.Scanner;

public class AuthManager implements AuthService {

    UserService userService;
    AccountService accountService;
    EmailService emailService;

    public AuthManager(UserService userService, AccountService accountService) {
        this.userService = userService;
        this.accountService = accountService;
    }

    public AuthManager(UserService userService, EmailService emailService) {
        this.userService = userService;
        this.emailService=emailService;
    }

    @Override
    public void login() {
        if (accountService.signIn()) {


        }
    }

    @Override
    public void register(User user) {
        if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println("Ad ve soyad en az 2 karakter olmalıdır");
        }
        if (!Utils.checkEmail(user.geteMail())) {
            System.out.println("Geçerli bir e-posta adresi girmelisiniz");
        }
        if (user.getPassword().length() < 6) {
            System.out.println("Şifre en az 6 karakter olmalıdır");

        }else if(userService.get(user.geteMail())!=null){
            System.out.println("Kullanıcı zaten kayıtlı");
        }
        else{
            System.out.println("Doğrulama kodu e-postanıza gönderildi");
            emailService.sendToEmail(user.geteMail());
            System.out.print("Kod : ");
            Scanner scan=new Scanner(System.in);
            if(emailService.verify(scan.nextInt())){
                System.out.println("Doğrulama onaylandı\nBaşarıyla kayıt oldunuz");
                userService.add(user);
            }
        }
    }
}
