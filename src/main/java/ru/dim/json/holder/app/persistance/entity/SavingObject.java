package ru.dim.json.holder.app.persistance.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("savedItems")
public class SavingObject {

    @Transient
    public static final String SEQUENCE_NAME = "items_sequence";
    @Id
    private long id;

    private Object body;

    public SavingObject(Object body) {
        super();
        this.body = body;
    }

    public long getId() {
        return id;
    }

    public Object getBody() {
        return body;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
