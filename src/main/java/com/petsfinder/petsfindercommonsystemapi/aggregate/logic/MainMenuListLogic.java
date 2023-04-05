package com.petsfinder.petsfindercommonsystemapi.aggregate.logic;

import com.petsfinder.petsfindercommonsystemapi.aggregate.service.MainMenuListService;
import com.petsfinder.petsfindercommonsystemapi.aggregate.store.MainMenuListStore;
import com.petsfinder.petsfindercommonsystemapi.entity.mainmenu.jpo.MenuListEntityJpo;
import com.petsfinder.petsfindercommonsystemapi.entity.mainmenu.vo.MenuListEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class MainMenuListLogic implements MainMenuListService {

    @Autowired
    MainMenuListStore mainMenuListStore;

    @Override
    public List<MenuListEntity> getMainMenuList() {

        List<MenuListEntity> wholeMainMenuList = MenuListEntityJpo.toDomains(mainMenuListStore.findAll().stream().toList());

        List<MenuListEntity> menuListEntities = new ArrayList<>();

        for (int i = 0; i < wholeMainMenuList.size(); i++) {
            String m_Code = wholeMainMenuList.get(i).getMenuCode();
            for (int j = 0; j < wholeMainMenuList.size(); j++) {
                if (m_Code.equals(wholeMainMenuList.get(j).getParentMenuCode()) && i != j) {
                    wholeMainMenuList.get(i).getSubMenuList().add(wholeMainMenuList.get(j));
                }
            }
            if (wholeMainMenuList.get(i).getSubMenuList().size() != 0) {
                menuListEntities.add(wholeMainMenuList.get(i));
            }
        }

        return menuListEntities;
    }
}
