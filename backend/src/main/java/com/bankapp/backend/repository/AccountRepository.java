package com.bankapp.backend.repository;

import com.bankapp.backend.entity.Account;
import com.bankapp.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findByOwner(User owner);

    Optional<Account> findByIdAndOwner(Long id, User owner);
}
