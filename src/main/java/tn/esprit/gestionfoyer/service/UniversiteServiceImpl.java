package tn.esprit.gestionfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyer.entity.Foyer;
import tn.esprit.gestionfoyer.entity.Universite;
import tn.esprit.gestionfoyer.repository.FoyerRepository;
import tn.esprit.gestionfoyer.repository.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{

    UniversiteRepository universiteRepository;
    FoyerRepository foyerRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public Universite addUniversite(Universite c) {
        return universiteRepository.save(c);
    }

    @Override
    public void removeUniversite(Long id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public Universite modifyUniversite(Universite c) {
        return universiteRepository.save(c);
    }

    @Override
    public Universite assignUniversiteToFoyer(Long universiteId, Long foyerId) {
        Foyer foyer = foyerRepository.findById(foyerId).get();
        Universite universite = universiteRepository.findById(universiteId).get();
        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }
}
