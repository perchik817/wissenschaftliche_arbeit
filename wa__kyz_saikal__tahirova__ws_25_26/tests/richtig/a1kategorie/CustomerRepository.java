package tests.richtig.a1kategorie;

import tests.fehlerhaft.d1kategorie.Customer;

public interface CustomerRepository {
      Customer findById(Long id);
      void save(Customer customer);
      void deleteById(Long id);
}
