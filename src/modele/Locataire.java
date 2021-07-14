package modele;

import java.time.LocalDate;

public class Locataire {
	private int id;
	private String numpiece;
	private String nom;
	private String prenom;
	private String telephone ;
	private LocalDate dateniassance;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumpiece() {
		return numpiece;
	}
	public void setNumpiece(String numpiece) {
		this.numpiece = numpiece;
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public LocalDate getDateniassance() {
		return dateniassance;
	}
	public void setDateniassance(LocalDate dateniassance) {
		this.dateniassance = dateniassance;
	}
	
	
	

}
