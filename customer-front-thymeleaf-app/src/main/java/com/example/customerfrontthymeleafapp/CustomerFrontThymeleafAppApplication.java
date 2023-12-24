package com.example.customerfrontthymeleafapp;

import com.example.customerfrontthymeleafapp.entities.Customer;
import com.example.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("mimou").email("m@gmail.com").build());
            customerRepository.save(Customer.builder().name("imane").email("imane@gmail.com").build());
            customerRepository.save(Customer.builder().name("hajar").email("hajar@gmail.com").build());
        };
    }

}
