package tests.richtig.a1kategorie;

import tests.fehlerhaft.d1kategorie.Customer;

public class CustomerService {
      private Customer customer;
      private CustomerRepository customerRepository;

      public Customer findCustomerById(Long customerId) {
            return customerRepository.findById(customerId);
      }
}
