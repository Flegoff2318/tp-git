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
}
