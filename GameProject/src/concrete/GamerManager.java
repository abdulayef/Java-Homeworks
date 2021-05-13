package concrete;

import abstracts.UserCheckService;
import entities.Gamer;

public class GamerManager {

    Gamer user;
    UserCheckService userCheckService;

    public GamerManager(Gamer user, UserCheckService userCheckService) {
        this.user = user;
        this.userCheckService=userCheckService;
    }

    public void register() throws Exception {

        if(userCheckService.checkUser(user)){
            System.out.println("Başarıyla kayıt oldunuz");

        }else{

            throw new Exception("Geçersiz kullanıcı");
        }

    }

    public void delete(){


    }

    public void update(){



    }
}
