package ru.savenkov.task3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Offer {
    @Id
    private UUID id;
    @Column(name = "serial_number")
    private String serialNumber;
    @Column(name = "sign_date")
    private LocalDate signDate;
    @Column(name = "ending_date")
    private LocalDate endingDate;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "client")
    private Client client;
    @Column(name = "stuff")
    private Stuff stuff;
    @Column(name = "office")
    private Office office;

    public Offer() {
    }

    public Offer(UUID id, String serialNumber, LocalDate signDate, LocalDate endingDate, LocalDate startDate, Client client, Stuff stuff, Office office) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.signDate = signDate;
        this.endingDate = endingDate;
        this.startDate = startDate;
        this.client = client;
        this.stuff = stuff;
        this.office = office;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public LocalDate getSignDate() {
        return signDate;
    }

    public void setSignDate(LocalDate signDate) {
        this.signDate = signDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Stuff getStuff() {
        return stuff;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Offer{");
        sb.append("id=").append(id);
        sb.append(", serialNumber='").append(serialNumber).append('\'');
        sb.append(", signDate=").append(signDate);
        sb.append(", endingDate=").append(endingDate);
        sb.append(", startDate=").append(startDate);
        sb.append(", client=").append(client);
        sb.append(", stuff=").append(stuff);
        sb.append(", office=").append(office);
        sb.append('}');
        return sb.toString();
    }
}
