package ru.dim.json.holder.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.dim.json.holder.app.persistance.facade.JsonDocumentFacade;

import java.util.List;

@RestController
@RequestMapping("/api/v1/json")
public class JsonHolderController {

    @Autowired
    JsonDocumentFacade facade;

    @PostMapping
    private long saveJsonDocument(@RequestBody Object document){
        return facade.saveObjectAsJson(document);
    }

    @GetMapping
    private List<Object> getAll(){
        return facade.findAll();
    }
}
