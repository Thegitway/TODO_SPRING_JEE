package com.emsi.todo.model;

import javax.persistence.*;

@Entity
@Table(name = "Utilisateur")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;
    private String nomComplet;
    private String adresseEmail;
    private String motDePasse;

    public User(){}

    public User(String nomComplet, String adresseEmail, String motDePasse) {
        this.nomComplet = nomComplet;
        this.adresseEmail = adresseEmail;
        this.motDePasse = motDePasse;
    }

    public int getUserId() {
        return userId;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public String getAdresseEmail() {
        return adresseEmail;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", nomComplet='" + nomComplet + '\'' +
                ", adresseEmail='" + adresseEmail + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                '}';
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public User setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public User setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
        return this;
    }

    public User setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
        return this;
    }

    public User setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
        return this;
    }


}
