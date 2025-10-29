package CHALLENGE1;

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
                kiosk.Cart();
            } else { // 0~4 이외의 숫자는 문자 안내후 재입력
                System.out.println(" 0~4 이내의 숫자를 입력해주세요. ");
            }
        } catch (NumberFormatException e) { //숫자가 아닌값 들어오면 문자 출력 후 재입력
            System.out.println(" 숫자만 입력해주세요. ");
        }

        kiosk.kategori();

        try {
            String mastr = sc.nextLine().trim();
            int maob = Integer.parseInt(mastr);

            if (maob == 1) {
                menu.initMenu();
                kiosk.Start();
                kiosk.Cart();
            }  else if(maob == 4) {
                System.out.println("아래와 같이 주문 하시겠습니까?");
                System.out.println("[ " + menu.getCateGori().get(3) + " ]");
                System.out.println("[ " + kiosk.Carts.get(0) + " ]");

                System.out.println("\n[ Total ]");
                System.out.println("W " + menu.getMenuItems().get(kiosk.number - 1).getPrice());

                System.out.println("\n1. 주문    2. 메뉴판");

                String ma2str = sc.nextLine().trim();
                int ma2ob = Integer.parseInt(ma2str);
                if(ma2ob == 1) {
                    System.out.println("주문이 완료되었습니다. 금액은 W"+menu.getMenuItems().get(kiosk.number - 1).getPrice() + " 입니다.");
                    kiosk.Carts.clear();// 장바구니 초기화
                }
            }
            else { // 0~4 이외의 숫자는 문자 안내후 재입력
                System.out.println(" 0~4 이내의 숫자를 입력해주세요. ");
            }
        } catch (NumberFormatException e) { //숫자가 아닌값 들어오면 문자 출력 후 재입력
            System.out.println(" 숫자만 입력해주세요. ");
        }
    }
}