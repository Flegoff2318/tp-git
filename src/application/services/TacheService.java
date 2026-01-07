package application.services;

import application.domaine.Etat;
import application.domaine.Tache;
import application.repositories.TacheRepository;

import java.util.List;

public class TacheService {

	private int compteurId = 11;
	private final TacheRepository tacheRepository;
	private List<Tache> listeTaches;

	public TacheService() {
		tacheRepository = new TacheRepository();
	}

	public int getCompteurId() {
		return compteurId;
	}

	public TacheRepository getTacheRepository() {
		return tacheRepository;
	}

	public void creer(String titre, String description){

		Tache nouvTache = new Tache(compteurId + 1, titre, Etat.NON_ASSIGNEE, null);
		listeTaches.add(nouvTache);
		IO.println(description);
		compteurId += 1;

	}

}
