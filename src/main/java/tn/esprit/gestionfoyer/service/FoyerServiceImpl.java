package tn.esprit.gestionfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyer.entity.Universite;
import tn.esprit.gestionfoyer.entity.Foyer;
import tn.esprit.gestionfoyer.repository.UniversiteRepository;
import tn.esprit.gestionfoyer.repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService{

    FoyerRepository FoyerRepository;
    UniversiteRepository universiteRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return FoyerRepository.findAll();
    }

    @Override
    public Foyer retrieveFoyer(Long id) {
        return FoyerRepository.findById(id).get();
    }

    @Override
    public Foyer addFoyer(Foyer c) {
        return FoyerRepository.save(c);
    }

    @Override
    public void removeFoyer(Long id) {
        FoyerRepository.deleteById(id);
    }

    @Override
    public Foyer modifyFoyer(Foyer c) {
        return FoyerRepository.save(c);
    }

    @Override
    public Foyer assignFoyerToUniversite(Long FoyerId, Long universiteId) {
        Universite universite = universiteRepository.findById(universiteId).get();
        Foyer Foyer = FoyerRepository.findById(FoyerId).get();
        Foyer.setUniversite(universite);
        return FoyerRepository.save(Foyer);
    }
}
