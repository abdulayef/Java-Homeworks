package adapters;

import abstracts.UserCheckService;
import entities.Gamer;

public class DefaultCheckManager implements UserCheckService {

    @Override
    public boolean checkUser(Gamer user) {
        if(isValidNationalityID(user)) return true;
        return false;
    }

    public boolean isValidNationalityID(Gamer user){

        if(user.getNationalityID().length()==11) return true;

        return false;

    }
}
