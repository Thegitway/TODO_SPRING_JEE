package com.emsi.todo1.repository;

import com.emsi.todo1.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Tache,Integer> {
}
