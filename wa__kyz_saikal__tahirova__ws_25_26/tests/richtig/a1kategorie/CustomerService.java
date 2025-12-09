package tests.richtig.a1kategorie;

import tests.fehlerhaft.d1kategorie.Customer;

public class CustomerService {

      private final CustomerRepository customerRepository;

      public CustomerService(CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
      }

      public Customer findCustomerById(Long customerId) {
            if (customerId == null || customerId <= 0) {
                  throw new IllegalArgumentException("Customer ID must be positive");
            }
            return customerRepository.findById(customerId);
      }
}
