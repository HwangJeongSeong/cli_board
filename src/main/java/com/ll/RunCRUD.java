package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

class ArticleManager extends getContent {
    private ArrayList<Article> articles = new ArrayList<>();
    private int nextId = 1;
    private Scanner scn;

    public ArticleManager(Scanner scn) {
        this.scn = scn;
    }

    public void register() {
        System.out.print("제목 : ");
        String subject = scn.nextLine();
        System.out.print("내용 : ");
        String content = scn.nextLine();

        Article article = new Article(nextId, subject, content);
        articles.add(article);
        System.out.println(nextId + "번 게시글이 등록되었습니다.");
        nextId++;
    }

    public void printList() {
        System.out.println("번호 / 제목 / 내용");
        System.out.println("----------------------");
        for (int i = articles.size() - 1; i >= 0; i--) {
            Article a = articles.get(i);
            System.out.println(a.getId() + " / " + a.getSubject() + " / " + a.getContent());
        }
    }

    public void delete(String cmd) {
        int id = parseId(cmd);
        Article target = findById(id);
        if (target != null) {
            articles.remove(target);
            System.out.println(id + "번 게시물이 삭제되었습니다.");
        } else {
            System.out.println(id + "번 게시물이 존재하지 않습니다.");
        }
    }

    public void update(String cmd) {
        int id = parseId(cmd);
        Article target = findById(id);
        if (target != null) {
            System.out.println("제목(기존) : " + target.getSubject());
            System.out.print("제목 : ");
            target.setSubject(scn.nextLine());

            System.out.println("내용(기존) : " + target.getContent());
            System.out.print("내용 : ");
            target.setContent(scn.nextLine());
        } else {
            System.out.println(id + "번 게시물이 존재하지 않습니다.");
        }
    }

    private int parseId(String cmd) {
        return Integer.parseInt(cmd.split("=")[1]);
    }

    private Article findById(int id) {
        for (Article a : articles) {
            if (a.getId() == id) return a;
        }
        return null;
    }
}