package adapters;

import Mernis.NEWKPSPublicSoap;
import abstracts.UserCheckService;
import entities.Gamer;

public class MernisCheckManager implements UserCheckService {


    @Override
    public boolean checkUser(Gamer user) {
        NEWKPSPublicSoap client = new NEWKPSPublicSoap();
        boolean result;

        try {
            result = client.TCKimlikNoDogrula(Long.valueOf(user.getNationalityID()), user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(), user.getDateOfBirth().getYear());
        } catch (Exception e) {
            result=false;
        }

        return result;
    }
}
