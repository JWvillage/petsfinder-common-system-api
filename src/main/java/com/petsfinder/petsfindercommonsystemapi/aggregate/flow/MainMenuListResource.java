package com.petsfinder.petsfindercommonsystemapi.aggregate.flow;

import com.petsfinder.petsfindercommonsystemapi.aggregate.service.MainMenuListService;
import com.petsfinder.petsfindercommonsystemapi.entity.mainmenu.vo.MenuListEntity;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainMenuListResource {

    @Autowired
    MainMenuListService mainMenuListService;

    @ResponseBody
    @Transactional
    @RequestMapping(value = "/v1/apis/PETSFINDER/mainMenu")
    public JSONArray mainMenuList() {

        List<MenuListEntity> mainMenuList = mainMenuListService.getMainMenuList();

        return JSONArray.fromObject(mainMenuList);
    }
}
