package CHALLENGE1;

import java.util.ArrayList;

public class Menu {


    // 속 // 캡슐화
    private ArrayList<MenuItem> menuitems = new ArrayList<>();
    private ArrayList<String> cateGori = new ArrayList<>();


    // 생 //
    public Menu() {
        this.initMenu();
        this.initCategories();
    }

    public void initMenu() {
        menuitems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuitems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuitems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가  토핑된 치즈버거"));
        menuitems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
    }

    public void initCategories() {
        cateGori.add("Burgers");
        cateGori.add("Drinks");
        cateGori.add("Desserts");
        cateGori.add("Orders");
        cateGori.add("Cancel");
    }

    //getter 캡슐화에 따른 간접접근 게터 생성
    public ArrayList<MenuItem> getMenuItems() {
        return menuitems;
    }

    public ArrayList<String> getCateGori() {
        return cateGori;
    }
}
