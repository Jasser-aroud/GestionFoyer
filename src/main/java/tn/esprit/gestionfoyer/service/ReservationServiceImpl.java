package tn.esprit.gestionfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyer.entity.Etudiant;
import tn.esprit.gestionfoyer.entity.Reservation;
import tn.esprit.gestionfoyer.repository.EtudiantRepository;
import tn.esprit.gestionfoyer.repository.ReservationRepository;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService{

    ReservationRepository reservationRepository;
    EtudiantRepository etudiantRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservation(String id) {
        return reservationRepository.findById(id).get();
    }

    @Override
    public Reservation addReservation(Reservation c) {
        return reservationRepository.save(c);
    }

    @Override
    public void removeReservation(String id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Reservation modifyReservation(Reservation c) {
        return reservationRepository.save(c);
    }

    @Override
    public Reservation assignReservationToEtudiant(String reservationId, Long etudiantId) {
        Etudiant etudiant = etudiantRepository.findById(etudiantId).get();
        Reservation reservation = reservationRepository.findById(reservationId).get();
        Set<Etudiant> etudiants = reservation.getEtudiants();
        etudiants.add(etudiant);
        return reservationRepository.save(reservation);
    }
}
