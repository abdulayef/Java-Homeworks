import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.EmailService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.EmailAccountService;
import eCommerce.business.concretes.EmailManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.AppleAccountAdapter;
import eCommerce.core.GoogleAccountAdapter;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String options = "\n1-Login\n2-Register\n3-Quit";
        UserDao userDao=new HibernateUserDao();
        UserService userService;
        AuthService authService;
        EmailService emailService;
        while (true) {
            System.out.println("Yapmak istediğin işlemi seç" + options);
            String answer = scan.nextLine();
            if (answer.equals("1")) {
                System.out.println(" \n=========== Giriş yap ===========\n ");
                System.out.println("giriş yapmak istediğin yöntemi seç \n1- E-posta adresi ile giriş yap\n2- Google hesabı ile giriş yap\n3- Apple hesabı ile giriş yap");
                String accountMethod = scan.nextLine();
                if (accountMethod.equals("1")) {
                    System.out.print("E-posta adresi : ");
                    String eMail = scan.nextLine();
                    System.out.print("Şifre : ");
                    String password = scan.nextLine();
                    userService = new UserManager(new HibernateUserDao());
                    authService = new AuthManager(userService, new EmailAccountService(userService, eMail, password));
                    authService.login();
                    return;
                } else if (accountMethod.equals("2")) {

                    System.out.print("E-posta adresi : ");
                    String eMail = scan.nextLine();
                    System.out.print("Şifre : ");
                    String password = scan.nextLine();
                    userService = new UserManager(userDao);
                    authService = new AuthManager(userService, new GoogleAccountAdapter(eMail, password));
                    authService.login();
                    return;
                }else if(accountMethod.equals("3")){

                    System.out.print("Apple Kimliği : ");
                    String appleID = scan.nextLine();
                    System.out.print("Şifre : ");
                    String password = scan.nextLine();
                    userService = new UserManager(userDao);
                    authService = new AuthManager(userService, new AppleAccountAdapter(appleID, password));
                    authService.login();
                }
                return;
            } else if (answer.equals("2")) {
                System.out.println(" \n=========== E-posta adresi ile üye ol ===========\n ");
                System.out.print("Ad : ");
                String firstName = scan.nextLine();
                System.out.print("Soyad : ");
                String lastName = scan.nextLine();
                System.out.print("E-posta adresi : ");
                String eMail = scan.nextLine();
                System.out.print("Şifre : ");
                String password = scan.nextLine();
                User user = new User(1, firstName, lastName, eMail, password);
                userService = new UserManager(userDao);
                authService = new AuthManager(userService, new EmailAccountService(userService, user));
                authService.register(user);
                return;
            } else if (answer.equals("3")) {
                System.out.println("Sistemden çıkış yapıldı");
                return;

            } else {
                System.out.println("Geçersiz işlem");
            }
        }
    }
}
