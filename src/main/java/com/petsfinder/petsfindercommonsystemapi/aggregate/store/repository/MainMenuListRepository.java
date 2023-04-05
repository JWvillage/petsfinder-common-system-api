package com.petsfinder.petsfindercommonsystemapi.aggregate.store.repository;

import com.petsfinder.petsfindercommonsystemapi.entity.mainmenu.jpo.MenuListEntityJpo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainMenuListRepository extends JpaRepository<MenuListEntityJpo, String> {

    List<MenuListEntityJpo> findAll();

    List<MenuListEntityJpo> findByMenucode(String menucode);
}
