package eCommerce.business.abstracts;

public interface EmailService {

    void sendToEmail(String eMail);
    boolean verify(int code);

}
