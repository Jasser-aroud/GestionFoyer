package tn.esprit.gestionfoyer.service;

import tn.esprit.gestionfoyer.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {

    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant(Long id);
    public Etudiant addEtudiant(Etudiant c);
    public void removeEtudiant(Long id);
    public Etudiant modifyEtudiant(Etudiant c);


}
