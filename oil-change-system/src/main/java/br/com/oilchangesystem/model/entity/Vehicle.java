package br.com.oilchangesystem.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private Customer customer;

    private String brand;

    private String model;

    private String color;

    private Integer productionYear;

    private String motor;

    @Column(unique = true)
    private String plate;

    private String fuelFilter;

    private String motorFilter;

    private String oilFilter;

    private String cabinFilter;

    private Integer sumpCapacity;

    private Boolean sumpProtector;

    private String oil;

    private Integer km;

    @OneToMany(mappedBy = "vehicle")
    private List<ServiceRecord> serviceRecord;

    public Vehicle() {}

    public Vehicle(Long id, Customer customer, String brand, String model, String color, Integer productionYear,
                   String motor, String plate, String fuelFilter, String motorFilter, String oilFilter,
                   String cabinFilter, Integer sumpCapacity, Boolean sumpProtector, String oil, Integer km) {
        this.id = id;
        this.customer = customer;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.motor = motor;
        this.plate = plate;
        this.fuelFilter = fuelFilter;
        this.motorFilter = motorFilter;
        this.oilFilter = oilFilter;
        this.cabinFilter = cabinFilter;
        this.sumpCapacity = sumpCapacity;
        this.sumpProtector = sumpProtector;
        this.oil = oil;
        this.km = km;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getFuelFilter() {
        return fuelFilter;
    }

    public void setFuelFilter(String fuelFilter) {
        this.fuelFilter = fuelFilter;
    }

    public String getMotorFilter() {
        return motorFilter;
    }

    public void setMotorFilter(String motorFilter) {
        this.motorFilter = motorFilter;
    }

    public String getOilFilter() {
        return oilFilter;
    }

    public void setOilFilter(String oilFilter) {
        this.oilFilter = oilFilter;
    }

    public String getCabinFilter() {
        return cabinFilter;
    }

    public void setCabinFilter(String cabinFilter) {
        this.cabinFilter = cabinFilter;
    }

    public Integer getSumpCapacity() {
        return sumpCapacity;
    }

    public void setSumpCapacity(Integer sumpCapacity) {
        this.sumpCapacity = sumpCapacity;
    }

    public Boolean getSumpProtector() {
        return sumpProtector;
    }

    public void setSumpProtector(Boolean sumpProtector) {
        this.sumpProtector = sumpProtector;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
