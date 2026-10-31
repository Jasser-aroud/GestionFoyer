package tn.esprit.gestionfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyer.entity.Reservation;
import tn.esprit.gestionfoyer.entity.Etudiant;
import tn.esprit.gestionfoyer.repository.ReservationRepository;
import tn.esprit.gestionfoyer.repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{

    EtudiantRepository etudiantRepository;
    ReservationRepository reservationRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiant(Long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public Etudiant addEtudiant(Etudiant c) {
        return etudiantRepository.save(c);
    }

    @Override
    public void removeEtudiant(Long id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant c) {
        return etudiantRepository.save(c);
    }


}
