package Lv3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Kiosk {


    // 속
    private ArrayList<MenuItem> menuitems = new ArrayList<>();
    Menu menu = new Menu();

    //생
    public Kiosk() {
        this.initItem();
    }

    public Kiosk(String name, Double price, String info ) {
        this.menuitems.add(new MenuItem(name, price, info));
    }

    public void initItem() {
        menuitems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuitems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuitems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가  토핑된 치즈버거"));
        menuitems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    //getter
    public ArrayList<MenuItem> getMenuItems() {
        return menuitems;
    }

    //

}
