package tech.itpark.crud;

import org.apache.catalina.Manager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.itpark.crud.manager.FlatManager;
import tech.itpark.crud.model.Flat;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

}
