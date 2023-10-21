package ru.savenkov.task3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.savenkov.task3.model.Client;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Controller//указываем, что это контроллер
@RequestMapping("/api/v1/client")//с этого начинается url
public class ClientController {
    @GetMapping("")//указываем, что это get запрос
    public ResponseEntity<List<Client>> getAllClients(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @GetMapping("/{id}")//указываем, что это get запрос
    public ResponseEntity<Client> getClientById(@PathVariable("id") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
