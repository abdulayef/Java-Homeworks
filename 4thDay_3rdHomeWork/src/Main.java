import abstracts.BaseCustomerManager;
import adepters.MernisServiceAdepters;
import concrete.StarbucksCustomerManager;
import entities.Customer;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdepters());
        customerManager.save(new Customer(1, "Birol", "ÖZTÜRK", "0", LocalDate.of(2000, 8, 7)));
    }

}
