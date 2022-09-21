package dev.folorunso;

import dev.folorunso.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class MongoApplication {

	@Autowired
	UserDAO userDAO;

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
		System.out.println("Ready");
	}

}
