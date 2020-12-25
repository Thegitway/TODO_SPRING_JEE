package com.emsi.todo1.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String nomComplet;
    private String adresseEmail;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
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
