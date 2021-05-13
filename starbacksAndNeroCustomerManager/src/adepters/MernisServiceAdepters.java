package adepters;

import MernisService.MEAKPSPublicSoap;
import abstracts.CustomerCheckService;
import entities.Customer;

public class MernisServiceAdepters implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        MEAKPSPublicSoap client=new MEAKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.NationalityId), customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth.getYear());
    }
}
