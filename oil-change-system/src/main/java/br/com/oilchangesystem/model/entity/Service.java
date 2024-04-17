package br.com.oilchangesystem.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "service")
    private List<ServiceRecord> serviceRecord;

    public Service() {}

    public Service(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
