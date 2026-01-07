package application.repositories;

import application.domaine.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurRepository {
	List<Utilisateur> utilisateurs = new ArrayList<>();

	public UtilisateurRepository() {
		utilisateurs.add(new Utilisateur("jdupont", "Dupont", "Jean", "jean.dupont@mail.com"));
		utilisateurs.add(new Utilisateur("srobert", "Robert", "Sophie", "sophie.robert@mail.com"));
		utilisateurs.add(new Utilisateur("tmartin", "Martin", "Thomas", "thomas.martin@mail.com"));
		utilisateurs.add(new Utilisateur("lmoreau", "Moreau", "Lucie", "lucie.moreau@mail.com"));
		utilisateurs.add(new Utilisateur("cgarcia", "Garcia", "Camille", "camille.garcia@mail.com"));
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
}
