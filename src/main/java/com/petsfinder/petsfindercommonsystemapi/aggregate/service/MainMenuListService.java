package com.petsfinder.petsfindercommonsystemapi.aggregate.service;

import com.petsfinder.petsfindercommonsystemapi.entity.mainmenu.vo.MenuListEntity;

import java.util.List;

public interface MainMenuListService {

    public List<MenuListEntity> getMainMenuList();
}
