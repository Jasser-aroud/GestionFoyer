package tn.esprit.gestionfoyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyer.entity.Bloc;
import tn.esprit.gestionfoyer.entity.Bloc;
import tn.esprit.gestionfoyer.entity.Foyer;
import tn.esprit.gestionfoyer.repository.BlocRepository;
import tn.esprit.gestionfoyer.repository.BlocRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{

    BlocRepository foyerRepository;
    BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long id) {
        return blocRepository.findById(id).get();
    }

    @Override
    public Bloc addBloc(Bloc c) {
        return blocRepository.save(c);
    }

    @Override
    public void removeBloc(Long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public Bloc modifyBloc(Bloc c) {
        return blocRepository.save(c);
    }

    @Override
    public Bloc assignBlocToFoyer(Long blocId, Long foyerId) {
        Bloc bloc = blocRepository.findById(blocId).get();
        Foyer foyer = foyerRepository.findById(foyerId).get().getFoyer();
        bloc.setFoyer(foyer);
        return blocRepository.save(bloc);
    }
}
