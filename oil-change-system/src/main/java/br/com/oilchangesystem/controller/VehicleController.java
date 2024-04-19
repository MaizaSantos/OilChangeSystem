package br.com.oilchangesystem.controller;

import br.com.oilchangesystem.model.entity.Vehicle;
import br.com.oilchangesystem.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/{id}")
    public ResponseEntity<Vehicle> save(@PathVariable Long id, @RequestBody Vehicle vehicle) {
        return ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.save(id, vehicle));
    }

    @GetMapping
    public List<Vehicle> findAll() {
        return vehicleService.findAll();
    }

    @GetMapping("/{id}")
    public Vehicle findById(@PathVariable Long id) {
        return vehicleService.findById(id);
    }

    @PutMapping("/{id}")
    public Vehicle update(@PathVariable Long id, @RequestBody Vehicle vehicle) {
        return vehicleService.update(id, vehicle);
    }

    @PutMapping("/disable/{id}")
    public ResponseEntity<Void> disable(@PathVariable Long id) {
        vehicleService.disable(id);
        return ResponseEntity.noContent().build();
    }

}
