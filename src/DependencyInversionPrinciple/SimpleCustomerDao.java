package DependencyInversionPrinciple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class SimpleCustomerDao implements CustomerDao {

    private HashMap<Integer, Customer> customers;

    public SimpleCustomerDao() {
        customers = new HashMap<>();
    }

    public SimpleCustomerDao(HashMap<Integer, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}
