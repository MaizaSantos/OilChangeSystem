package br.com.oilchangesystem.repository;

import br.com.oilchangesystem.model.entity.ServiceRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRecordRepository extends JpaRepository<ServiceRecord, Long> {

    List<ServiceRecord> findByCustomerIdOrderByDateDesc(Long id);

}
