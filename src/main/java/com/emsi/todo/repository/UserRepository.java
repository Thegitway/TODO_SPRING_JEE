package com.emsi.todo.repository;

import com.emsi.todo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    Optional<User> findByAdresseEmailAndMotDePasse(String addresseEmail, String motDePasse);
}
