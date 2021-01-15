package com.emsi.todo.repository;

import com.emsi.todo.model.Liste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ListRepository extends JpaRepository<Liste,Integer> {
  @Query(nativeQuery = true, value = "SELECT * FROM listes WHERE utilisateur_utilisateurid = :id")
  List<Liste> rechercherParUserID(@Param("id") Integer id);

  @Query("SELECT l FROM Liste l WHERE l.Utilisateur.userId= :userID")
  List<Liste> rechByUserID(@Param("userID") Integer id);
}
