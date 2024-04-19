package br.com.oilchangesystem.service;

import br.com.oilchangesystem.model.entity.Service;
import br.com.oilchangesystem.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    public Service save(Service service) {
        return serviceRepository.save(service);
    }

}
