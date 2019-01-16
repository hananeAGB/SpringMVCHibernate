package com.ensat.model;
// Generated 16 janv. 2019 15:15:17 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name="utilisateur"
    ,catalog="atelier"
)
public class Utilisateur  implements java.io.Serializable {


     private Integer idUser;
     private String nom;
     private String photo;
     private String prenom;
     private String profession;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String photo, String prenom, String profession) {
       this.nom = nom;
       this.photo = photo;
       this.prenom = prenom;
       this.profession = profession;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idUser", unique=true, nullable=false)
    public Integer getIdUser() {
        return this.idUser;
    }
    
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    
    @Column(name="nom")
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="photo")
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    
    @Column(name="prenom")
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    @Column(name="profession")
    public String getProfession() {
        return this.profession;
    }
    
    public void setProfession(String profession) {
        this.profession = profession;
    }
}

