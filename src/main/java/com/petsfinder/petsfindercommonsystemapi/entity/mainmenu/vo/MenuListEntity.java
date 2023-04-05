package com.petsfinder.petsfindercommonsystemapi.entity.mainmenu.vo;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class MenuListEntity {
    private String menuId;
    private String menuName;
    private String menuLevelValue;
    private String menuCode;
    private Boolean showIndicator;
    private String fullMenuName;
    private String parentMenuCode;
    private String parentMenuName;
    private String screenPathText;
    private List<MenuListEntity> subMenuList;

    public MenuListEntity() {
        //
    }

    public MenuListEntity(
        String menuId,
        String menuName,
        String menuLevelValue,
        String menuCode,
        Boolean showIndicator,
        String fullMenuName,
        String parentMenuCode,
        String parentMenuName,
        String screenPathText
    ) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuLevelValue = menuLevelValue;
        this.menuCode = menuCode;
        this.showIndicator = showIndicator;
        this.fullMenuName = fullMenuName;
        this.parentMenuCode = parentMenuCode;
        this.parentMenuName = parentMenuName;
        this.screenPathText = screenPathText;
        this.subMenuList = new ArrayList<>();
    }

    Constable toJson() {
        return (new Gson()).toJson(this);
    }
}
