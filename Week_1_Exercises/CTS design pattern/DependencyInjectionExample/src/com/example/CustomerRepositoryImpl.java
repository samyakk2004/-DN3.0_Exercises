

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customersDatabase;

    public CustomerRepositoryImpl() {
        customersDatabase = new HashMap<>();
        customersDatabase.put(1, new Customer(1, "Samyak Bhattacharya"));
        customersDatabase.put(2, new Customer(2, "Rahul Sinha"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customersDatabase.get(id);
    }
}
