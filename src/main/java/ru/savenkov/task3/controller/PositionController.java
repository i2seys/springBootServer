package ru.savenkov.task3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.savenkov.task3.model.Office;
import ru.savenkov.task3.model.Position;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/api/v1/office")
public class PositionController {
    @GetMapping("")//указываем, что это get запрос
    public ResponseEntity<List<Position>> getAllPositions(){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
    @GetMapping("/{id}")//указываем, что это get запрос
    public ResponseEntity<Position> getPositionById(@PathVariable("id") String id){
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
