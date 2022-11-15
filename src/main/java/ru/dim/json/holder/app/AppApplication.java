package ru.dim.json.holder.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import ru.dim.json.holder.app.persistance.repository.JsonDocumentRepository;

@SpringBootApplication
@EnableMongoRepositories
public class AppApplication {
	@Autowired
	JsonDocumentRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

}
