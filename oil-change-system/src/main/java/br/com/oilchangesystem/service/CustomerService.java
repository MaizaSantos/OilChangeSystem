package br.com.oilchangesystem.service;

import br.com.oilchangesystem.model.entity.Customer;
import br.com.oilchangesystem.model.entity.Vehicle;
import br.com.oilchangesystem.repository.CustomerRepository;
import br.com.oilchangesystem.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    public Customer save(Customer customer) {
        Customer customerSaved = customerRepository.save(customer);

        Vehicle vehicle = customer.getVehicles().getFirst();
        vehicle.setCustomer(customerSaved);

        vehicleRepository.save(vehicle);

        return customerSaved;
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

}
