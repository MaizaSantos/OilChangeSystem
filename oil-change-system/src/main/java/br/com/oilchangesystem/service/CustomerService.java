package br.com.oilchangesystem.service;

import br.com.oilchangesystem.model.entity.Customer;
import br.com.oilchangesystem.model.entity.Vehicle;
import br.com.oilchangesystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private VehicleService vehicleService;

    public void save(Customer customer) {
        Customer customerSaved = customerRepository.save(customer);

        List<Vehicle> vehicles = customer.getVehicles();
        if (!vehicles.isEmpty()) {
            vehicleService.save(customerSaved.getId(), vehicles.getFirst());
        }

    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(Long id) {
        return customerRepository.findById(id).get();
    }

    public Customer update(Long id, Customer customerUpdated) {
        Customer customer = findById(id);

        customer.setName(customerUpdated.getName());
        customer.setEmail(customerUpdated.getEmail());
        customer.setPhone(customerUpdated.getPhone());

        return customerRepository.save(customer);
    }

    public void disable(Long id) {
        Customer customer = findById(id);

        customer.setActive(false);
        customer.getVehicles().forEach(vehicle -> vehicle.setActive(false));

        customerRepository.save(customer);
    }

}
