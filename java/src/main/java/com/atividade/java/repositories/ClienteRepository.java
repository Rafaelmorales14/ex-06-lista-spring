package com.atividade.java.repositories;

import com.atividade.java.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
    public ClienteModel findByEmail(String email);
}
