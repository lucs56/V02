package com.example.demo;

import com.example.demo.model.Client;
import com.example.demo.model.User;
import com.example.demo.repository.clientRepository;
import com.example.demo.repository.userRepository;
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
        CommandLineRunner commandLineRunner(
                userRepository userRepository,
                clientRepository clientRepository
        ){
            return args -> {
                User user1 = userRepository.save(new User(null,"leo","1234"));
                Client client1 = clientRepository.save(new Client(null,"Leonardo Davila", user1));
                System.out.println(client1.toString());
            };
        }
        }

