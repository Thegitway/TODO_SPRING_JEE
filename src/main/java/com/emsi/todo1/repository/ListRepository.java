package com.emsi.todo1.repository;

import com.emsi.todo1.model.Liste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ListRepository extends JpaRepository<Liste,Integer> {
  @Query(nativeQuery=true, value="SELECT * FROM list WHERE Utilisateur= :id")
    List<Liste> rechercherParUserID(@Param("id") Integer id);
}
