package com.example.demo;

import com.example.demo.model.Client;
import com.example.demo.repository.clientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.observation.ClientRequestObservationContext;

import java.sql.Timestamp;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(clientRepository clientRepository){
        return args -> {
            Client client1 = new Client(
                    null,
                    "Jorge",
                    true,
                    new Timestamp(System.currentTimeMillis()),
                    "1234",
                    "jorge@email.com"
            );
            clientRepository.save(client1);
            Client client2 = clientRepository.findByIdAndActive(1l,true);
            System.out.println(client2.toString());
        };
    }
}
