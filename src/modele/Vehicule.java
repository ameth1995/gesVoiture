package modele;

public class Vehicule {
	private int id;
	private String couleur;
	private String nomCarteGrise;
	private int nbch;
	private Models model;
	
	
	
	
	
	public Vehicule() {
		this.model = new Models();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getNomCarteGrise() {
		return nomCarteGrise;
	}
	public void setNomCarteGrise(String nomCarteGrise) {
		this.nomCarteGrise = nomCarteGrise;
	}
	public int getNbch() {
		return nbch;
	}
	public void setNbch(int nbch) {
		this.nbch = nbch;
	}
	public Models getModel() {
		return model;
	}
	public void setModel(Models model) {
		this.model = model;
	}
	
	
	

}
