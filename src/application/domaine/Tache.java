package application.domaine;

public class Tache {
	private int id;
	private String titre;
	private Etat etat;
	private String idUtilisateurAssigne;

	public Tache(int id, String titre, Etat etat, String idUtilisateurAssigne) {
		this.id = id;
		this.titre = titre;
		this.etat = etat;
		this.idUtilisateurAssigne = idUtilisateurAssigne;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public String getIdUtilisateurAssigne() {
		return idUtilisateurAssigne;
	}

	public void setIdUtilisateurAssigne(String idUtilisateurAssigne) {
		this.idUtilisateurAssigne = idUtilisateurAssigne;
	}
}
