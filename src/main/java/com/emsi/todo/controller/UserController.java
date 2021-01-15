package com.emsi.todo.controller;

import com.emsi.todo.model.User;
import com.emsi.todo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    //URL http(s)://localhost:8080/..

    //GET : recuperer des inforamtions
    //Post:creer un nouvel enregistrement
    //POST , PATCH, PUT : mettre a jour un enregistrement
    //DELETE: supprimer un enregistrement
    @GetMapping("/users")
    List<User> getUsers()
    {
        return repository.findAll();
    }
    @GetMapping("/user")
    User getUserByID(@RequestParam("id") Integer uid)
    {
    /*    Optional<User> user= repository.findById(id);
                if(user.isPresent())
                    return user.get();

                return null;
*/

                return repository.findById(uid).orElseThrow();
    }

    @GetMapping("/user/{uid}")
    User getUserByID2(@PathVariable Integer uid)
    {
        return repository.findById(uid).orElseThrow();
    }

    @PostMapping("/user")
    User createUser(@RequestBody User user)
    {
       return repository.save(user);
    }

    @PostMapping("/user/{uid}")
    User updateUser(@PathVariable Integer uid,@RequestBody User user)
    {
        User u=repository.findById(uid).orElse(null);
        if(u!=null)
        {
            if(user.getNomComplet()!=null)
                u.setNomComplet(user.getNomComplet());
            if(user.getAdresseEmail()!=null)
                u.setAdresseEmail(user.getAdresseEmail());
            if(user.getMotDePasse()!=null)
                u.setMotDePasse(user.getMotDePasse());
            return repository.save(user);
        }
        return null;
    }

  @DeleteMapping("/user/{uid}")
  void deleteUserByID(@PathVariable Integer uid) {
    repository.deleteById(uid);
  }

  @PostMapping("/login")
  User login(@RequestBody User user) throws Exception {
    if (user.getAdresseEmail() != null && user.getMotDePasse() != null) {
      return repository.findByAdresseEmailAndMotDePasse(user.getAdresseEmail(), user.getMotDePasse()).orElseThrow();
    }

    throw new Exception();
  }

}
