import eCommerce.business.abstracts.AccountService;
import eCommerce.business.abstracts.AuthService;
import eCommerce.business.abstracts.EmailService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.AuthManager;
import eCommerce.business.concretes.DefaultAccountManager;
import eCommerce.business.concretes.EmailManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.GoogleAccountAdapter;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.dataAccess.concretes.InMemoryUserDao;
import eCommerce.entities.concretes.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        UserDao userDao = new InMemoryUserDao();
        UserService userService = new UserManager(userDao);
        EmailService emailService=new EmailManager();

        AuthService authService;
        AccountService accountService;

        Scanner scan = new Scanner(System.in);

        String whichProcess = "Hangi işlemi yapmak istiyorsun?\n1- Giriş Yap\n2- Kayıt Ol";
        System.out.println(whichProcess);
        String process = scan.nextLine();

        if (process.equals("1")) {
            System.out.println("\n========== Giriş Yap ==========\n\n1- E-posta adresi ile giriş yap\n2- Google hesabı ile giriş yap");
            String whichAccount = scan.nextLine();
            if(whichAccount.equals("1")){

                System.out.print("E-posta adresi : ");
                String eMail=scan.nextLine();
                System.out.print("Şifre : ");
                String password= scan.nextLine();

                accountService=new DefaultAccountManager(eMail, password, userService);
                authService=new AuthManager(userService, accountService);
                authService.login();

            }else if(whichAccount.equals("2")){

                System.out.print("E-posta adresi : ");
                String eMail=scan.nextLine();
                System.out.print("Şifre : ");
                String password= scan.nextLine();

                accountService=new GoogleAccountAdapter(eMail, password);
                authService=new AuthManager(userService, accountService);
                authService.login();
            }

        } else if (process.equals("2")) {
            System.out.println("\n========== Kayıt Ol ==========\n");

            System.out.print("Ad : ");
            String firstName=scan.nextLine();
            System.out.print("Soyad : ");
            String lastName= scan.nextLine();
            System.out.print("E-posta adresi : ");
            String eMail=scan.nextLine();
            System.out.print("Şifre : ");
            String password= scan.nextLine();

            User user=new User(1, firstName, lastName, eMail, password);
            authService=new AuthManager(userService, emailService);
            authService.register(user);

        }
    }
}
