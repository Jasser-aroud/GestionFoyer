package tn.esprit.gestionfoyer.service;

import tn.esprit.gestionfoyer.entity.Reservation;

import java.util.List;

public interface IReservationService {

    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(String id);
    public Reservation addReservation(Reservation c);
    public void removeReservation(String id);
    public Reservation modifyReservation(Reservation c);

    public Reservation assignReservationToEtudiant(String reservationId, Long etudiantId);

}
