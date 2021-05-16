package eCommerce.business.concretes;

import eCommerce.business.abstracts.EmailService;

import java.util.Random;

public class EmailManager implements EmailService {

    int code;

    @Override
    public void sendToMail() {

        code=generateCode();
        System.out.println(" \n"+code+"\n ");
        System.out.println("Doğrulama kodu gönderildi");
    }

    @Override
    public boolean verifyMail(int code) {
        if (code==this.code) {
            System.out.println(" \nHesap onaylandı\n ");
            return true;
        } else {
            System.out.println(" \nGeçersiz kod\n ");
        }
        return false;
    }
        public int generateCode () {
            Random random = new Random();
            return random.nextInt(899999) + 100000;

        }

    }
