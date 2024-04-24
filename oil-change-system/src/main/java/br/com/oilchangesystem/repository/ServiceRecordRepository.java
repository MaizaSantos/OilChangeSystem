package br.com.oilchangesystem.repository;

import br.com.oilchangesystem.model.entity.ServiceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRecordRepository extends JpaRepository<ServiceRecord, Long> {}
