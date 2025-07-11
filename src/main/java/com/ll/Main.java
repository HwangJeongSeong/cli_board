package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ______              _      ______                          _ ");
        System.out.println("|  _  \\            | |     | ___ \\                        | |");
        System.out.println("| | | |  __ _  ___ | |__   | |_/ /  ___    __ _  _ __   __| |");
        System.out.println("| | | | / _` |/ __|| '_ \\  | ___ \\ / _ \\  / _` || '__| / _` |");
        System.out.println("| |/ / | (_| |\\__ \\| | | | | |_/ /| (_) || (_| || |   | (_| |");
        System.out.println("|___/   \\__,_||___/|_| |_| \\____/  \\___/  \\__,_||_|    \\__,_|");
        System.out.println("                                                             ");
        System.out.println("                                                             ");

        System.out.println("Select");
        Scanner scn = new Scanner(System.in);
        Plus add = new Plus();

        while (true) {
            System.out.println("명령) 등록 (종료하려면 '종료' 입력)");
            String title = scn.nextLine();
            if (title.equals("종료")) {
                System.out.println("종료합니다.");
                break;
            }

            System.out.print("내용 입력: ");
            String script = scn.nextLine();

            System.out.println("제목: " + title);
            System.out.println("내용: " + script);
            System.out.println("게시판 번호: " + add.num());
        }
    }
}

class Plus {
    int a = 1;

    int num() {
        return a++;
    }
}
