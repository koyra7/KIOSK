package Lv3;

import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 호출
        Scanner sc = new Scanner(System.in);
        Kiosk kiosk = new Kiosk();

        // 저장된 데이터 불러오기
        kiosk.initItem(); // 메뉴로 변경
        kiosk.Start();

    }
}