package DependencyInversionPrinciple;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomerServiceTest {

    private CustomerService customerService;

    @Before
    public void setUpCustomerServiceInstance() {
        var customers = new HashMap<Integer, Customer>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        customerService = new CustomerService(new SimpleCustomerDao(customers));
    }

    @Test
    public void givenCustomerServiceInstance_whenCalledFindById_thenCorrect() {
        assertThat(customerService.findById(1)).isInstanceOf(Optional.class);
    }

    @Test
    public void givenCustomerServiceInstance_whenCalledFindAll_thenCorrect() {
        assertThat(customerService.findAll()).isInstanceOf(List.class);
    }

    @Test
    public void givenCustomerServiceInstance_whenCalledFindByIdWithNullCustomer_thenCorrect() {
        var customers = new HashMap<Integer, Customer>();
        customers.put(1, null);
        customerService = new CustomerService(new SimpleCustomerDao(customers));
        Customer customer = customerService.findById(1).orElseGet(() -> new Customer("Non-existing customer"));
        assertThat(customer.getName()).isEqualTo("Non-existing customer");
    }
}
