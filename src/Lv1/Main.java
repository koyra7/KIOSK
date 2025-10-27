package Lv1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 호출
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        boolean sw = true;

        while (sw) {
            // 줄단위로 입력받음
            String Line = scanner.nextLine();
            // String의 길이가 0이 아니면 저장
            if(Line.length()!=0) {
                list.add(Line);
            } else { // 0이면 재입력 유도
                System.out.println("재입력 해주세요.");
            }

            // 입력된 값 출력
            for(int i=0;i<list.size();i++) {
                System.out.println((i + 1) + ". " + list.get(i));


                if(i == list.size()) System.out.println("0. 종료   | 종료");

                // 0 입력시 종료
                if (Line.equals("0")) {
                    System.out.println("프로그램을 종료합니다.");
                    sw = false;
                    break;
                } else if(Line.equals(i)) {
                    System.out.println();
                }

            }
        }
        }

}


