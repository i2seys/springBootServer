package ru.savenkov.task3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.savenkov.task3.dto.NewOfferParameters;
import ru.savenkov.task3.dto.OfferStatistic;
import ru.savenkov.task3.model.Offer;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/api/v1/offer")
public class OfferController {
    @GetMapping("")//указываем, что это get запрос
    public ResponseEntity<List<Offer>> getAllOffers(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @GetMapping("/{id}")//указываем, что это get запрос
    public ResponseEntity<Offer> getOfferById(@PathVariable("id") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @PutMapping("")
    public Offer signNewOffer(@RequestBody NewOfferParameters offerParameters) {
        return null;
    }
    @GetMapping("/statistics")//указываем, что это get запрос
    public ResponseEntity<OfferStatistic> getOfferStatistic(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
