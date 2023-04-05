package com.petsfinder.petsfindercommonsystemapi.aggregate.store.jpastore;

import com.petsfinder.petsfindercommonsystemapi.aggregate.store.MainMenuListStore;
import com.petsfinder.petsfindercommonsystemapi.aggregate.store.repository.MainMenuListRepository;
import com.petsfinder.petsfindercommonsystemapi.entity.mainmenu.jpo.MenuListEntityJpo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MainMenuListJpaStore implements MainMenuListStore {

    @Autowired
    MainMenuListRepository mainMenuListRepository;

    @Override
    public List<MenuListEntityJpo> findAll() {
        return mainMenuListRepository.findAll();
    }

    @Override
    public List<MenuListEntityJpo> findByMenucode(String menucode) {
        return mainMenuListRepository.findByMenucode(menucode);
    }
}
