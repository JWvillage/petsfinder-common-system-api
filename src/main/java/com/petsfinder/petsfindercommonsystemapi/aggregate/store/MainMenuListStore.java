package com.petsfinder.petsfindercommonsystemapi.aggregate.store;

import com.petsfinder.petsfindercommonsystemapi.entity.mainmenu.jpo.MenuListEntityJpo;

import java.util.List;

public interface MainMenuListStore {

    List<MenuListEntityJpo> findAll();

    List<MenuListEntityJpo> findByMenucode(String menucode);
}
