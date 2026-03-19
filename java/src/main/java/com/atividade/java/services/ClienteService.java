package com.atividade.java.services;

import com.atividade.java.models.ClienteModel;
import com.atividade.java.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public ClienteModel save(ClienteModel clienteModel) {
        return repository.save(clienteModel);
    }

    public List<ClienteModel> findAll() {
        return repository.findAll();
    }

    public Optional<ClienteModel> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
