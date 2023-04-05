package com.petsfinder.petsfindercommonsystemapi.entity.mainmenu.jpo;

import com.petsfinder.petsfindercommonsystemapi.entity.mainmenu.vo.MenuListEntity;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Table(name = "menulist")
public class MenuListEntityJpo {
    @Id
    @Column
    private String menuid;
    @Column
    private String menuname;
    @Column
    private String menulevelvalue;
    @Column
    private String menucode;
    @Column
    private Boolean showindicator;
    @Column
    private String fullmenuname;
    @Column
    private String parentmenucode;
    @Column
    private String parentmenuname;
    @Column
    private String screenpathtext;

    public MenuListEntityJpo() {
        //
    }

    public MenuListEntityJpo(MenuListEntity menuListEntity) {
        this.menuid = menuListEntity.getMenuId();
        this.menuname = menuListEntity.getMenuName();
        this.menulevelvalue = menuListEntity.getMenuLevelValue();
        this.menucode = menuListEntity.getMenuCode();
        this.showindicator = menuListEntity.getShowIndicator();
        this.fullmenuname = menuListEntity.getFullMenuName();
        this.parentmenucode = menuListEntity.getParentMenuCode();
        this.parentmenuname = menuListEntity.getParentMenuName();
        this.screenpathtext = menuListEntity.getScreenPathText();
    }

    public MenuListEntity toDomain() {
        return new MenuListEntity(
                this.menuid,
                this.menuname,
                this.menulevelvalue,
                this.menucode,
                this.showindicator,
                this.fullmenuname,
                this.parentmenucode,
                this.parentmenuname,
                this.screenpathtext
        );
    }

    public static List<MenuListEntity> toDomains(List<MenuListEntityJpo> menuListEntityJpos) {
        if (menuListEntityJpos == null || menuListEntityJpos.isEmpty())
            return new ArrayList<MenuListEntity>();

        return menuListEntityJpos.stream()
                .map(MenuListEntityJpo::toDomain)
                .collect(Collectors.toList());
    }
}
