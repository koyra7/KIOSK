package Lv4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 호출
        Scanner sc = new Scanner(System.in);
        Kiosk kiosk = new Kiosk();
        Menu menu = new Menu();

        // 저장된 데이터 불러오기

        kiosk.kategori();

        try {
            String mastr = sc.nextLine().trim();
            int maob = Integer.parseInt(mastr);

            if (maob == 1) {
                menu.initMenu();
                kiosk.Start();
            } else { // 0~4 이외의 숫자는 문자 안내후 재입력
                System.out.println(" 0~4 이내의 숫자를 입력해주세요. ");
            }
        } catch (NumberFormatException e) { //숫자가 아닌값 들어오면 문자 출력 후 재입력
            System.out.println(" 숫자만 입력해주세요. ");
        }

    }
}