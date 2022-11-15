package ru.dim.json.holder.app.persistance.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.dim.json.holder.app.persistance.PersistanceUtils;
import ru.dim.json.holder.app.persistance.entity.SavingObject;
import ru.dim.json.holder.app.persistance.repository.JsonDocumentRepository;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class JsonDocumentFacade {

    @Autowired
    JsonDocumentRepository repository;
    @Autowired
    PersistanceUtils persistanceUtils;
    public long saveObjectAsJson(Object object){
        SavingObject savingObject = new SavingObject(object);
        savingObject.setId(persistanceUtils.generateSequence(SavingObject.SEQUENCE_NAME));
        return repository.save(savingObject).getId();
    }

    public List<Object> findAll(){
        return repository.findAll().stream().map(obj -> obj.getBody()).collect(Collectors.toList());
    }
}
