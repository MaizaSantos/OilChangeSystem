package br.com.oilchangesystem.repository;

import br.com.oilchangesystem.model.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {}
