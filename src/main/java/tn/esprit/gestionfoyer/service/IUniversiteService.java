package tn.esprit.gestionfoyer.service;

import tn.esprit.gestionfoyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {

    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long id);
    public Universite addUniversite(Universite c);
    public void removeUniversite(Long id);
    public Universite modifyUniversite(Universite c);

    public Universite assignUniversiteToFoyer(Long universiteId, Long foyerId);

}
