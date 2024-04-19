package br.com.oilchangesystem.controller;

import br.com.oilchangesystem.model.entity.Vehicle;
import br.com.oilchangesystem.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/{id}")
    public ResponseEntity<Vehicle> save(@PathVariable Long id, @RequestBody Vehicle vehicle) {
        return ResponseEntity.status(HttpStatus.CREATED).body(vehicleService.save(id, vehicle));
    }

}
