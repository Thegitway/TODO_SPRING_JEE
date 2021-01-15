package com.emsi.todo.controller;


import com.emsi.todo.model.Liste;
import com.emsi.todo.repository.ListRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class ListeController {
  private final ListRepository repository;

  public ListeController(ListRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/userlists/{id}")
  List<Liste> getUserLists(@PathVariable Integer id) {
    return repository.rechercherParUserID(id);
  }
}
