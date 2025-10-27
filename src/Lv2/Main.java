package Lv2;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 호출
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        List<MenuItem> menuitems = new ArrayList<>();

        // list에 데이터 집어넣음
        menuitems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuitems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuitems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가  토핑된 치즈버거"));
        menuitems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));
//        System.out.println(menuitems.size()); 디버깅용

        // 메뉴 출력하기
        System.out.println("[ SHACKESHACK MENU ]");
        for(int i = 0; i < menuitems.size(); i++ ) {
            int j = i + 1;

            System.out.println( j + ". " + menuitems.get(i).MenuItemname + " | W " + menuitems.get(i).MenuItemprice +" | " + menuitems.get(i).MenuIteminfo );

        }
        System.out.println("0. 종료");

        // 메뉴 번호 입력받음
        int object =  sc.nextInt();

        switch (object) {
            case 1:
                System.out.println( menuitems.get(0).MenuItemname + " | W " + menuitems.get(0).MenuItemprice +" | " + menuitems.get(0).MenuIteminfo );
                break;
            case 2:
                System.out.println( menuitems.get(1).MenuItemname + " | W " + menuitems.get(1).MenuItemprice +" | " + menuitems.get(1).MenuIteminfo );
                break;
            case 3:
                System.out.println( menuitems.get(2).MenuItemname + " | W " + menuitems.get(2).MenuItemprice +" | " + menuitems.get(2).MenuIteminfo );
                break;
            case 4:
                System.out.println( menuitems.get(3).MenuItemname + " | W " + menuitems.get(3).MenuItemprice +" | " + menuitems.get(3).MenuIteminfo );
                break;
            }

        }

    }




