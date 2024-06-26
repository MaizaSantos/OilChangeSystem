package br.com.oilchangesystem.service;

import br.com.oilchangesystem.model.entity.Service;
import br.com.oilchangesystem.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public Service save(Service service) {
        service.setActive(true);
        return serviceRepository.save(service);
    }

    public List<Service> findAll() {
        return serviceRepository.findAll();
    }

    public Service findById(Long id) {
        return serviceRepository.findById(id).get();
    }

    public void disable(Long id) {
        Service service = serviceRepository.findById(id).get();

        service.setActive(false);
        
        serviceRepository.save(service);
    }

}
