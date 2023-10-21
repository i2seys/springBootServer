package ru.savenkov.task3.dto;

import java.util.Map;
import java.util.Set;

public class OfferStatistic {
    private Map<String, Integer> stuffStatistics;
    private Map<String, Integer> clientStatistics;
    private Set<String> clientSurnames;

    public OfferStatistic() {
    }

    public OfferStatistic(Map<String, Integer> stuffStatistics, Map<String, Integer> clientStatistics, Set<String> clientSurnames) {
        this.stuffStatistics = stuffStatistics;
        this.clientStatistics = clientStatistics;
        this.clientSurnames = clientSurnames;
    }

    public Map<String, Integer> getStuffStatistics() {
        return stuffStatistics;
    }

    public void setStuffStatistics(Map<String, Integer> stuffStatistics) {
        this.stuffStatistics = stuffStatistics;
    }

    public Map<String, Integer> getClientStatistics() {
        return clientStatistics;
    }

    public void setClientStatistics(Map<String, Integer> clientStatistics) {
        this.clientStatistics = clientStatistics;
    }

    public Set<String> getClientSurnames() {
        return clientSurnames;
    }

    public void setClientSurnames(Set<String> clientSurnames) {
        this.clientSurnames = clientSurnames;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("OfferStatistic{");
        sb.append("stuffStatistics=").append(stuffStatistics);
        sb.append(", clientStatistics=").append(clientStatistics);
        sb.append(", clientSurnames=").append(clientSurnames);
        sb.append('}');
        return sb.toString();
    }
}
