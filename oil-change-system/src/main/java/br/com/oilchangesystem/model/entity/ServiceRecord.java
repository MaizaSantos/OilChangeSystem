package br.com.oilchangesystem.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.SourceType;

import java.time.LocalDateTime;

@Entity
@Table
public class ServiceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    @ManyToOne
    @JoinColumn
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn
    private Service service;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
    @CurrentTimestamp(source = SourceType.VM)
    private LocalDateTime date;

    public ServiceRecord() {}

    public ServiceRecord(Long id, Customer customer, Vehicle vehicle, Service service, LocalDateTime date) {
        this.id = id;
        this.customer = customer;
        this.vehicle = vehicle;
        this.service = service;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Service getService() {
        return service;
    }

    public LocalDateTime getDate() {
        return date;
    }

}
