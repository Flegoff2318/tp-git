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

    public Utilisateur creerUtilisateur(String prenom, String nom) {
        String identifiantUtilisateur = prenom.charAt(0) + nom;
        Utilisateur nouvelUtilisateur = new Utilisateur(identifiantUtilisateur, nom, prenom, "");
        utilisateurRepository.getUtilisateurs().add(nouvelUtilisateur);
        return nouvelUtilisateur;
    }

    public List<Utilisateur> rechercherTous(){
        return utilisateurRepository.getUtilisateurs();
    }
}
