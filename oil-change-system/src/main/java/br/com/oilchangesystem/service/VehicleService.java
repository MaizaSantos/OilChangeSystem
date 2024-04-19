package br.com.oilchangesystem.service;

import br.com.oilchangesystem.model.entity.Customer;
import br.com.oilchangesystem.model.entity.Vehicle;
import br.com.oilchangesystem.repository.CustomerRepository;
import br.com.oilchangesystem.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Vehicle save(Long id, Vehicle vehicle) {
        Customer customer = customerRepository.findById(id).get();

        vehicle.setCustomer(customer);
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

}
