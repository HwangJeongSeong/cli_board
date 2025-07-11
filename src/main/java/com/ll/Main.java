package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Scanner는 루프 밖에서 한 번만 생성
        while (true) {
            String input = scn.nextLine();
            if (input.equals("종료")) {
                System.out.println("종료");
                break;
            }
        }
        scn.close();
    }
}
