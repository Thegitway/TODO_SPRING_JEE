package com.emsi.todo1.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tacheID;
    private String description;
    private String dateEcheance;
    private String dateRappel;
    private boolean etat;
    private boolean important;

    @ManyToOne
    private Liste liste ;
    public Tache(){}

    public Tache(int tacheID, String description, String dateEcheance, String dateRappel, boolean etat, boolean important) {
        this.tacheID = tacheID;
        this.description = description;
        this.dateEcheance = dateEcheance;
        this.dateRappel = dateRappel;
        this.etat = etat;
        this.important = important;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "tacheID=" + tacheID +
                ", description='" + description + '\'' +
                ", dateEcheance='" + dateEcheance + '\'' +
                ", dateRappel='" + dateRappel + '\'' +
                ", etat=" + etat +
                ", important=" + important +
                '}';
    }

    public Tache setTacheID(int tacheID) {
        this.tacheID = tacheID;
        return this;
    }

    public Tache setDescription(String description) {
        this.description = description;
        return this;
    }

    public Tache setDateEcheance(String dateEcheance) {
        this.dateEcheance = dateEcheance;
        return this;
    }

    public Tache setDateRappel(String dateRappel) {
        this.dateRappel = dateRappel;
        return this;
    }

    public Tache setEtat(boolean etat) {
        this.etat = etat;
        return this;
    }

    public Tache setImportant(boolean important) {
        this.important = important;
        return this;
    }

    public int getTacheID() {
        return tacheID;
    }

    public String getDescription() {
        return description;
    }

    public String getDateEcheance() {
        return dateEcheance;
    }

    public String getDateRappel() {
        return dateRappel;
    }

    public boolean isEtat() {
        return etat;
    }

    public boolean isImportant() {
        return important;
    }


}
