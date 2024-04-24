package br.com.oilchangesystem.service;

import br.com.oilchangesystem.model.entity.ServiceRecord;
import br.com.oilchangesystem.repository.ServiceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceRecordService {

    @Autowired
    private ServiceRecordRepository serviceRecordRepository;

    public void save(ServiceRecord serviceRecord) {
        serviceRecordRepository.save(serviceRecord);
    }

    public List<ServiceRecord> findAll() {
        return serviceRecordRepository.findAll(Sort.by(Sort.Direction.DESC, "date"));
    }

}
