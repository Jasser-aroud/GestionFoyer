package tn.esprit.gestionfoyer.service;

import tn.esprit.gestionfoyer.entity.Foyer;

import java.util.List;

public interface IFoyerService {

    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer(Long id);
    public Foyer addFoyer(Foyer c);
    public void removeFoyer(Long id);
    public Foyer modifyFoyer(Foyer c);

    public Foyer assignFoyerToUniversite(Long FoyerId, Long universiteId);

}
