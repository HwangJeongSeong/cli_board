package com.ll.controller;

import com.ll.model.ArticleRepository;
import com.ll.view.View;

import java.util.Scanner;

public class Controller {
    private final Scanner scn = new Scanner(System.in);
    private final ArticleRepository repository = new ArticleRepository();
    private final View view = new View(scn, repository);

    public void run() {
        System.out.println("== 게시판 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String cmd = scn.nextLine().trim();

            if (cmd.equals("종료")) break;
            else if (cmd.equals("등록")) view.register();
            else if (cmd.equals("목록")) view.printList();
            else if (cmd.startsWith("삭제?id=")) view.delete(cmd);
            else if (cmd.startsWith("수정?id=")) view.update(cmd);
            else System.out.println("올바르지 않은 명령입니다.");
        }
    }
}