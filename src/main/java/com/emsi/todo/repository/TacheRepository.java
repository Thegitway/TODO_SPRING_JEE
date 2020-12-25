package com.emsi.todo.repository;

import com.emsi.todo.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Tache,Integer> {
}
