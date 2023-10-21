package ru.savenkov.task3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
public class Office {
    @Id
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "law_address")
    private String lawAddress;
    @Column(name = "cabinets_count")
    private Integer cabinetsCount;

    public Office() {
    }

    public Office(UUID id, String name, String address, String lawAddress, Integer cabinetsCount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.lawAddress = lawAddress;
        this.cabinetsCount = cabinetsCount;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLawAddress() {
        return lawAddress;
    }

    public void setLawAddress(String lawAddress) {
        this.lawAddress = lawAddress;
    }

    public Integer getCabinetsCount() {
        return cabinetsCount;
    }

    public void setCabinetsCount(Integer cabinetsCount) {
        this.cabinetsCount = cabinetsCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Office{");
        sb.append("id=").append(id);
        sb.append(", address='").append(address).append('\'');
        sb.append(", lawAddress='").append(lawAddress).append('\'');
        sb.append(", cabinetsCount=").append(cabinetsCount);
        sb.append('}');
        return sb.toString();
    }
}
