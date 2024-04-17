package br.com.oilchangesystem.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

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

    private LocalDate date;

    public ServiceRecord() {}

    public ServiceRecord(Long id, Customer customer, Vehicle vehicle, Service service, LocalDate date) {
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

    public LocalDate getDate() {
        return date;
    }

}
