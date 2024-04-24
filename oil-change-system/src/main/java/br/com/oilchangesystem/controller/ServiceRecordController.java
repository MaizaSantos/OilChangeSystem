package br.com.oilchangesystem.controller;

import br.com.oilchangesystem.model.entity.ServiceRecord;
import br.com.oilchangesystem.service.ServiceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
public class ServiceRecordController {

    @Autowired
    private ServiceRecordService serviceRecordService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody ServiceRecord serviceRecord) {
        serviceRecordService.save(serviceRecord);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public List<ServiceRecord> findAll() {
        return serviceRecordService.findAll();
    }

    @GetMapping("/{id}")
    public List<ServiceRecord> findAllByCustomerId(@PathVariable Long id) {
        return serviceRecordService.findAllByCustomerId(id);
    }

}
