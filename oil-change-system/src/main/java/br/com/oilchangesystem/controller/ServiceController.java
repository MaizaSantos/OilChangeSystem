package br.com.oilchangesystem.controller;

import br.com.oilchangesystem.model.entity.Service;
import br.com.oilchangesystem.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @PostMapping
    public ResponseEntity<Service> save(@RequestBody Service service) {
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceService.save(service));
    }

    @GetMapping
    public List<Service> findAll(Service service) {
        return serviceService.findAll();
    }

    @GetMapping("/{id}")
    public Service findById(@PathVariable Long id) {
        return serviceService.findById(id);
    }

}
