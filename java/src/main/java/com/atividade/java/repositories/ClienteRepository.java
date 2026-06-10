package com.atividade.java.repositories;

import com.atividade.java.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, UUID> {
    public ClienteModel findByEmail(String email);
    public UserDetails findByLogin(String role);
}
