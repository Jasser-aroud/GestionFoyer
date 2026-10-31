package tn.esprit.gestionfoyer.service;

import tn.esprit.gestionfoyer.entity.Bloc;

import java.util.List;

public interface IBlocService {

    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long id);
    public Bloc addBloc(Bloc c);
    public void removeBloc(Long id);
    public Bloc modifyBloc(Bloc c);

    public Bloc assignBlocToFoyer(Long blocId, Long foyerId);

}
