package ru.dim.json.holder.app.persistance.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import ru.dim.json.holder.app.persistance.entity.SavingObject;

import java.util.List;

@Repository
public interface JsonDocumentRepository extends MongoRepository<SavingObject, Long> {
}
