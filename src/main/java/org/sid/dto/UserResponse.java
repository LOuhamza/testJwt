package org.sid.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    @JsonProperty("IdUtilisateur")
    public int idUtilisateur;
    @JsonProperty("CodeUtilisateur")
    public String codeUtilisateur;
    @JsonProperty("Nom")
    public String nom;
    @JsonProperty("Prenom")
    public String prenom;
    @JsonProperty("CodeAgence")
    public String codeAgence;
    @JsonProperty("IdPeriodeComptable")
    public int idPeriodeComptable;
    @JsonProperty("IdCaisse")
    public int idCaisse;
    @JsonProperty("CodeRole")
    public int codeRole;
    @JsonProperty("Role")
    public String role;
    @JsonProperty("Societe")
    public int societe;
    @JsonProperty("IpAdress")
    public String ipAdress;

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getCodeUtilisateur() {
        return codeUtilisateur;
    }

    public void setCodeUtilisateur(String codeUtilisateur) {
        this.codeUtilisateur = codeUtilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCodeAgence() {
        return codeAgence;
    }

    public void setCodeAgence(String codeAgence) {
        this.codeAgence = codeAgence;
    }

    public int getIdPeriodeComptable() {
        return idPeriodeComptable;
    }

    public void setIdPeriodeComptable(int idPeriodeComptable) {
        this.idPeriodeComptable = idPeriodeComptable;
    }

    public int getIdCaisse() {
        return idCaisse;
    }

    public void setIdCaisse(int idCaisse) {
        this.idCaisse = idCaisse;
    }

    public int getCodeRole() {
        return codeRole;
    }

    public void setCodeRole(int codeRole) {
        this.codeRole = codeRole;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSociete() {
        return societe;
    }

    public void setSociete(int societe) {
        this.societe = societe;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }
}
