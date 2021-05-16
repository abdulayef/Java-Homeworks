package eCommerce.business.abstracts;

public interface EmailService {

    void sendToMail();
    boolean verifyMail(int code);

}
