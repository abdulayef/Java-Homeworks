package eCommerce.business.concretes;

import eCommerce.business.abstracts.AccountService;
import eCommerce.business.abstracts.EmailService;
import eCommerce.business.abstracts.UserService;
import eCommerce.entities.concretes.User;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailAccountService implements AccountService {

    UserService userService;
    String eMail;
    String password;
    User user;

    public EmailAccountService(UserService userService, String eMail, String password) {
        this.userService = userService;
        this.eMail = eMail;
        this.password = password;
    }

    public EmailAccountService(UserService userService, User user) {
        this.userService = userService;
        this.user = user;
        this.eMail = user.geteMail();
        this.password = user.getPassword();
    }

    @Override
    public boolean registerIsValid() {
        if (!isNameValid(user.getFirstName(), user.getLastName())) {
            System.out.println("Ad ve soyad en az 2 karakter olmalıdır");
        }
        if (!isEmailValid(eMail)) {
            System.out.println("Geçersiz e-posta adresi girdiniz");
        }
        if (!isPasswordValid(password)) {
            System.out.println("Şifre en az 6 karakter olmalıdır");
            return false;
        } else {
            if (userService.get(eMail) != null) {
                System.out.println("Bu kullanıcı zaten mevcut");
                return false;
            }
                EmailService emailService = new EmailManager();
                emailService.sendToMail();
                Scanner scan = new Scanner(System.in);
                System.out.print("Doğrulama Kodu : ");
                int code = scan.nextInt();
                if (!emailService.verifyMail(code)) return false;
                System.out.println("Başarıyla kayıt oldunuz");
        }
        return true;
    }

    @Override
    public boolean loginIsValid() {
        if (!isEmailValid(eMail)) {
            System.out.println("Geçersiz e-posta adresi girdiniz");
            return false;
        }
        if (!isPasswordValid(password)) {
            System.out.println("Şifre en az 6 karakter olmalıdır");
            return false;
        }
        if (userService.get(eMail) == null) {
            System.out.println("kullanıcı bulunamadı");
            return false;

        } else if (userService.get(eMail).getPassword().equals(password)) {
            System.out.println("Başarıyla giriş yaptınız");
        }
        return true;
    }


    public boolean isPasswordValid(String password) {

        return password.length() >= 6;

    }

    public boolean isEmailValid(String eMail) {

        if (eMail == null || eMail.isEmpty()) return false;

        return Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", eMail);

    }

    public boolean isNameValid(String firstName, String lastName) {

        return firstName.length() >= 2 && lastName.length() >= 2;
    }
}
