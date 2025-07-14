package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 게시판 앱 ==");
        Scanner scn = new Scanner(System.in);
        ArticleManager manager = new ArticleManager(scn);

        while (true) {
            System.out.print("명령) ");
            String cmd = scn.nextLine().trim();

            if (cmd.equals("종료")) break;
            else if (cmd.equals("등록")) manager.register();
            else if (cmd.equals("목록")) manager.printList();
            else if (cmd.startsWith("삭제?id=")) manager.delete(cmd);
            else if (cmd.startsWith("수정?id=")) manager.update(cmd);
            else System.out.println("올바르지 않은 명령입니다.");
        }
    }
}
