package com.emsi.todo1.repository;

import com.emsi.todo1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

     Optional<User> findByAdresseEmailAndMotDePasse(String adresseEmail, String motDePasse);


}
