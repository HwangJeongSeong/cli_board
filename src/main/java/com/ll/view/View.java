package com.ll.view;

import com.ll.model.Article;
import com.ll.model.ArticleRepository;

import java.util.List;
import java.util.Scanner;

public class View {
    private final Scanner scn;
    private final ArticleRepository repo;

    public View(Scanner scn, ArticleRepository repo) {
        this.scn = scn;
        this.repo = repo;
    }

    public void register() {
        System.out.print("제목 : ");
        String subject = scn.nextLine();
        System.out.print("내용 : ");
        String content = scn.nextLine();

        Article article = repo.save(subject, content);
        System.out.println(article.getId() + "번 게시글이 등록되었습니다.");
    }

    public void printList() {
        System.out.println("번호 / 제목 / 내용");
        System.out.println("----------------------");
        List<Article> articles = repo.findAll();
        for (int i = articles.size() - 1; i >= 0; i--) {
            Article a = articles.get(i);
            System.out.println(a.getId() + " / " + a.getSubject() + " / " + a.getContent());
        }
    }

    public void delete(String cmd) {
        int id = parseId(cmd);
        boolean result = repo.deleteById(id);
        if (result) {
            System.out.println(id + "번 게시물이 삭제되었습니다.");
        } else {
            System.out.println(id + "번 게시물이 존재하지 않습니다.");
        }
    }

    public void update(String cmd) {
        int id = parseId(cmd);
        Article a = repo.findById(id);
        if (a == null) {
            System.out.println(id + "번 게시물이 존재하지 않습니다.");
            return;
        }

        System.out.println("제목(기존) : " + a.getSubject());
        System.out.print("제목 : ");
        a.setSubject(scn.nextLine());

        System.out.println("내용(기존) : " + a.getContent());
        System.out.print("내용 : ");
        a.setContent(scn.nextLine());
    }

    private int parseId(String cmd) {
        return Integer.parseInt(cmd.split("=")[1]);
    }
}

