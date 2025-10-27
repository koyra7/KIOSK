package Lv3;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 호출
        Scanner sc = new Scanner(System.in);
        Kiosk kiosk = new Kiosk();

        // 저장된 데이터 불러오기
        kiosk.initItem();

        // 메뉴 출력하기
        while (true) {
            // 가게 메뉴 출력
            System.out.println("[ SHACKESHACK MENU ]");
            // 반복문으로 본메뉴 출력
            for (int i = 0; i < 4; i++) {
                int j = i + 1;

                System.out.println(j + ". " + kiosk.getMenuItems().get(i).name + " | W " + kiosk.getMenuItems().get(i).price + " | " + kiosk.getMenuItems().get(i).info);

            }
            System.out.println("0. 종료");

            // 메뉴 번호 입력받음
            int object = sc.nextInt();

            switch (object) {
                case 1:
                    System.out.println("선택한 메뉴: " + kiosk.getMenuItems().get(0).name + " | W " + kiosk.getMenuItems().get(0).price + " | " + kiosk.getMenuItems().get(0).info);
                    break;
                case 2:
                    System.out.println("선택한 메뉴: " + kiosk.getMenuItems().get(0).name + " | W " + kiosk.getMenuItems().get(0).price + " | " + kiosk.getMenuItems().get(0).info);
                    break;
                case 3:
                    System.out.println("선택한 메뉴: " + kiosk.getMenuItems().get(0).name + " | W " + kiosk.getMenuItems().get(0).price + " | " + kiosk.getMenuItems().get(0).info);
                    break;
                case 4:
                    System.out.println("선택한 메뉴: " + kiosk.getMenuItems().get(0).name + " | W " + kiosk.getMenuItems().get(0).price + " | " + kiosk.getMenuItems().get(0).info);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println(" 잘못 입력된 번호입니다. 다시 입력해주세요.");
                    continue;
            }
            if(object == 0) break;

        }
        sc.close();
    }


}





