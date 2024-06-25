package com.example.demo.repository;


import com.example.demo.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends CrudRepository<Client, Long> {
    public Client findByIdAndActive(Long id, Boolean active);
}
