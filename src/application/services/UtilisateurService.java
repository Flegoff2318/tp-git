package application.services;

import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;

import java.util.List;

public class UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;
	private List<Utilisateur> listeUtilisateurs;

	public UtilisateurService() {
		utilisateurRepository = new UtilisateurRepository();
	}

	public void rechercherParId(String idUser){

		listeUtilisateurs.stream()
				.filter(user -> user.getIdentifiant().equals(idUser))
				.forEach(IO::println);

	}

}
