package com.mygu.mygube.repositories;

import com.mygu.mygube.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IAccountRepository extends JpaRepository<Account, UUID> {
    Optional<Account> findByUsername(String username);
}
