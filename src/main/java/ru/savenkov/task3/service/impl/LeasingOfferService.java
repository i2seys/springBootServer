package ru.savenkov.task3.service.impl;

import ru.savenkov.task3.model.Client;
import ru.savenkov.task3.model.Offer;
import ru.savenkov.task3.model.Stuff;
import ru.savenkov.task3.service.OfferService;

import java.time.LocalDate;

public class LeasingOfferService implements OfferService {
    @Override
    public Offer signNewOffer(LocalDate startDate, LocalDate endingDate, Client client, Stuff stuff) {
        return null;
    }
}
