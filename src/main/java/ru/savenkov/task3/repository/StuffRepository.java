package ru.savenkov.task3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.savenkov.task3.model.Client;
import ru.savenkov.task3.model.Stuff;

import java.util.UUID;

@Repository
public interface StuffRepository  extends CrudRepository<Stuff, UUID> {
}
