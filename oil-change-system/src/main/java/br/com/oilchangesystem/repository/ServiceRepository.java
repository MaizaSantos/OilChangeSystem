package br.com.oilchangesystem.repository;

import br.com.oilchangesystem.model.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {}
