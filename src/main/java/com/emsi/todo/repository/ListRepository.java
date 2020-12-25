package com.emsi.todo.repository;

import com.emsi.todo.model.Liste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<Liste,Integer> {
}
