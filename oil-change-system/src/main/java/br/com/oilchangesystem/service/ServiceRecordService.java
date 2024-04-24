package br.com.oilchangesystem.service;

import br.com.oilchangesystem.model.entity.ServiceRecord;
import br.com.oilchangesystem.repository.ServiceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRecordService {

    @Autowired
    private ServiceRecordRepository serviceRecordRepository;

    public void save(ServiceRecord serviceRecord) {
        serviceRecordRepository.save(serviceRecord);
    }

}
