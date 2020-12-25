package com.emsi.todo.model;

import javax.persistence.*;

@Entity
public class Liste {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int listeID;
    private String nomListe;
    private String icone;
    private String backGround;

    @ManyToOne
    private User Utilisateur;

    public Liste(){}

    public Liste(int listeID, String nomListe, String icone, String backGround) {
        this.listeID = listeID;
        this.nomListe = nomListe;
        this.icone = icone;
        this.backGround = backGround;
    }

    @Override
    public String toString() {
        return "List{" +
                "listeID=" + listeID +
                ", nomListe='" + nomListe + '\'' +
                ", icone='" + icone + '\'' +
                ", backGround='" + backGround + '\'' +
                '}';
    }

    public Liste setListeID(int listeID) {
        this.listeID = listeID;
        return this;
    }

    public Liste setNomListe(String nomListe) {
        this.nomListe = nomListe;
        return this;
    }

    public Liste setIcone(String icone) {
        this.icone = icone;
        return this;
    }

    public Liste setBackGround(String backGround) {
        this.backGround = backGround;
        return this;
    }

    public int getListeID() {
        return listeID;
    }

    public String getNomListe() {
        return nomListe;
    }

    public String getIcone() {
        return icone;
    }

    public String getBackGround() {
        return backGround;
    }





    public Liste setUtilisateur(User utilisateur) {
        Utilisateur = utilisateur;
        return this;
    }

    public User getUtilisateur() {
        return Utilisateur;
    }
}
