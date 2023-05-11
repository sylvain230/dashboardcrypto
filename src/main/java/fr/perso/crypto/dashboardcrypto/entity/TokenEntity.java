package fr.perso.crypto.dashboardcrypto.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="token")
public class TokenEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;

    @Column(name = "nom", length = 50, nullable = false)
    private String nom;

    @Column(name = "nomToken", length = 50, nullable = false)
    private String nomToken;

    @Column(name = "blockchain", length = 50, nullable = false)
    private String blockchain;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "prix", nullable = false)
    private Double prix;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNomToken() {
        return nomToken;
    }

    public void setNomToken(String nomToken) {
        this.nomToken = nomToken;
    }

    public String getBlockchain() {
        return blockchain;
    }

    public void setBlockchain(String blockchain) {
        this.blockchain = blockchain;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
