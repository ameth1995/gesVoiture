package modele;

public class Models {

	private int id ;
	private String libelle;
	private Marque marque;
	
	
	
	
	
	public Models() {
		this.marque = new Marque(); 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	
	
}
