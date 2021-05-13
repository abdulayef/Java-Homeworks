package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    CustomerCheckService iCustomerCheckService;

    public StarbucksCustomerManager(CustomerCheckService iCustomerCheckService) {
        this.iCustomerCheckService = iCustomerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {
        if(iCustomerCheckService.checkIfRealPerson(customer)){
            super.save(customer);

        }else {
            throw new Exception("Geçerli değil");
        }
    }
}
