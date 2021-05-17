package eCommerce.business.concretes;

import eCommerce.business.abstracts.EmailService;

import java.util.Random;

public class EmailManager implements EmailService {

    Random random=new Random();
    int code;

    @Override
    public void sendToEmail(String eMail) {
        code=random.nextInt(899999) + 100000;
        System.out.println("\n"+code+"\n");
    }

    @Override
    public boolean verify(int code) {
        if(code==this.code) return true;
        return false;
    }
}
