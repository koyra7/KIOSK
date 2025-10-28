package Lv4;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {


    // 속
    private ArrayList<MenuItem> menuitems = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu(); // 클래스 변수명 = new 생성자  -> new 생성자로 Menu에 있는 16라인 생성자 호출 하여 이용


    // 기능
    public void kategori() {

        System.out.println("[ MAIN MENU ]");

        // 카테고리 출력
        for(int i = 0; i < 3; i++) {
            int j = i + 1;
            System.out.println((j + ". " + menu.getCateGori().get(i) ));
        }
        System.out.println("0. 종료");
    }

    public void Start() {
        boolean flag = true;
        while (flag) {
            // 가게 메뉴 출력
            System.out.println("[ SHACKESHACK MENU ]");

            // 반복문으로 본메뉴 출력
            for (int i = 0; i < 4; i++) {
                int j = i + 1;

                System.out.println(j + ". " + menu.getMenuItems().get(i).getName() + " | W " + menu.getMenuItems().get(i).getPrice() + " | " + menu.getMenuItems().get(i).getInfo());

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
                            System.out.println("선택한 메뉴: " + menu.getMenuItems().get(0).getName() + " | W " + menu.getMenuItems().get(0).getPrice() + " | " + menu.getMenuItems().get(0).getInfo());
                            flag = false;
                            break;
                        case 2:
                            System.out.println("선택한 메뉴: " + menu.getMenuItems().get(0).getName() + " | W " + menu.getMenuItems().get(0).getPrice() + " | " + menu.getMenuItems().get(0).getInfo());
                            flag = false;
                            break;
                        case 3:
                            System.out.println("선택한 메뉴: " + menu.getMenuItems().get(0).getName() + " | W " + menu.getMenuItems().get(0).getPrice() + " | " + menu.getMenuItems().get(0).getInfo());
                            flag = false;
                            break;
                        case 4:
                            System.out.println("선택한 메뉴: " + menu.getMenuItems().get(0).getName() + " | W " + menu.getMenuItems().get(0).getPrice() + " | " + menu.getMenuItems().get(0).getInfo());
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
