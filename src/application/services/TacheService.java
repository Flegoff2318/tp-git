package application.services;

import application.domaine.Etat;
import application.domaine.Tache;
import application.repositories.TacheRepository;

public class TacheService {

	private int compteurId = 11;
	private final TacheRepository tacheRepository;

	public TacheService() {
		tacheRepository = new TacheRepository();
	}

	public int getCompteurId() {
		return compteurId;
	}

	public TacheRepository getTacheRepository() {
		return tacheRepository;
	}

	public void assignerTache(int identifiantTache, String identifiantUtilisateur){
		Tache tache = tacheRepository.getTaches().stream()
				.filter(t -> t.getId()==identifiantTache)
				.findFirst()
				.orElseThrow(()->new RuntimeException("Tache inexistante."));
		tache.setIdUtilisateurAssigne(identifiantUtilisateur);
		tache.setEtat(Etat.EN_COURS);
		// tacheRepository.save(tache);
	}
}
