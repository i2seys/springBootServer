package ru.savenkov.task3.dto;

import java.time.LocalDate;
import java.util.UUID;

public class NewOfferParameters {
    private UUID clientId;
    private UUID stuffId;
    private LocalDate startDate;//дата в ISO формате yyyy-MM-dd
    private LocalDate endingDate;//дата в ISO формате yyyy-MM-dd

    public NewOfferParameters(UUID clientId, UUID stuffId, LocalDate startDate, LocalDate endingDate) {
        this.clientId = clientId;
        this.stuffId = stuffId;
        this.startDate = startDate;
        this.endingDate = endingDate;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public UUID getStuffId() {
        return stuffId;
    }

    public void setStuffId(UUID stuffId) {
        this.stuffId = stuffId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NewOfferParameters{");
        sb.append("clientId=").append(clientId);
        sb.append(", stuffId=").append(stuffId);
        sb.append(", startDate=").append(startDate);
        sb.append(", endingDate=").append(endingDate);
        sb.append('}');
        return sb.toString();
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }
}
