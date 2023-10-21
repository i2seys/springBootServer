package ru.savenkov.task3.service;

import ru.savenkov.task3.model.Client;
import ru.savenkov.task3.model.Offer;
import ru.savenkov.task3.model.Stuff;

import java.time.LocalDate;

public interface OfferService {
    public Offer signNewOffer(LocalDate startDate, LocalDate endingDate, Client client, Stuff stuff);
}
