package br.com.oilchangesystem.service;

import br.com.oilchangesystem.model.entity.Customer;
import br.com.oilchangesystem.model.entity.Vehicle;
import br.com.oilchangesystem.repository.CustomerRepository;
import br.com.oilchangesystem.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
        vehicle.setActive(true);
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> findAll() {
        return vehicleRepository.findAll(Sort.by(Sort.Direction.ASC, "brand"));
    }

    public Vehicle findById(Long id) {
        return vehicleRepository.findById(id).get();
    }

    public Vehicle update(Long id, Vehicle vehicleUpdated) {
        Vehicle vehicle = vehicleRepository.findById(id).get();

        vehicle.setColor(vehicleUpdated.getColor());
        vehicle.setMotor(vehicleUpdated.getMotor());
        vehicle.setPlate(vehicleUpdated.getPlate());
        vehicle.setFuelFilter(vehicleUpdated.getFuelFilter());
        vehicle.setMotorFilter(vehicleUpdated.getMotorFilter());
        vehicle.setOilFilter(vehicleUpdated.getOilFilter());
        vehicle.setCabinFilter(vehicleUpdated.getCabinFilter());
        vehicle.setSumpCapacity(vehicleUpdated.getSumpCapacity());
        vehicle.setSumpProtector(vehicleUpdated.getSumpProtector());
        vehicle.setOil(vehicleUpdated.getOil());
        vehicle.setKm(vehicleUpdated.getKm());

        return vehicleRepository.save(vehicle);
    }

    public void disable(Long id) {
        Vehicle vehicle = vehicleRepository.findById(id).get();

        vehicle.setActive(false);
        
        vehicleRepository.save(vehicle);
    }

}
