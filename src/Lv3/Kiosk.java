package Lv3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {


    // 속
    private ArrayList<MenuItem> menuitems = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

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

    // 기능

    public void Start() {
        boolean flag = true;
        while (flag) {
            // 가게 메뉴 출력
            System.out.println("[ SHACKESHACK MENU ]");

            // 반복문으로 본메뉴 출력
            for (int i = 0; i < 4; i++) {
                int j = i + 1;

                System.out.println(j + ". " + getMenuItems().get(i).name + " | W " + getMenuItems().get(i).price + " | " + getMenuItems().get(i).info);

            }
            System.out.println("0. 종료");

            // 메뉴 번호 입력받음
            try {
                String str = sc.nextLine().trim(); // hi hello >> hihello
                int object = Integer.parseInt(str);  // "1 -> 1 ,h -> 50, e-> 57, llo" -> "1" 보다 매우 높은 숫자
//                String.valueOf(변수명); // String -> int 변환
                if (object >= 0 && object <= 4) { //0~4까지만 입력받음
                    switch (object) {
                        case 1:
                            System.out.println("선택한 메뉴: " + getMenuItems().get(0).name + " | W " + getMenuItems().get(0).price + " | " + getMenuItems().get(0).info);
                            flag = false;
                            break;
                        case 2:
                            System.out.println("선택한 메뉴: " + getMenuItems().get(0).name + " | W " + getMenuItems().get(0).price + " | " + getMenuItems().get(0).info);
                            flag = false;
                            break;
                        case 3:
                            System.out.println("선택한 메뉴: " + getMenuItems().get(0).name + " | W " + getMenuItems().get(0).price + " | " + getMenuItems().get(0).info);
                            flag = false;
                            break;
                        case 4:
                            System.out.println("선택한 메뉴: " + getMenuItems().get(0).name + " | W " + getMenuItems().get(0).price + " | " + getMenuItems().get(0).info);
                            flag = false;
                            break;
                        case 0:
                            System.out.println("프로그램을 종료합니다.");
                            flag = false;
                            break;
                    }
                } else { // 0~4 이외의 숫자는 문자 안내후 재입력
                    System.out.println(" 0~4 이내의 숫자를 입력해주세요. ");
                }
            } catch (NumberFormatException e) { //숫자가 아닌값 들어오면 문자 출력 후 재입력
                System.out.println(" 숫자만 입력해주세요. ");
            }
        }
    }

}
