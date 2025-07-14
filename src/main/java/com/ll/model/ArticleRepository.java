package com.ll.model;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    private final List<Article> articles = new ArrayList<>();
    private int nextId = 1;

    public Article save(String subject, String content) {
        Article article = new Article(nextId++, subject, content);
        articles.add(article);
        return article;
    }

    public List<Article> findAll() {
        return articles;
    }

    public Article findById(int id) {
        for (Article a : articles) {
            if (a.getId() == id) return a;
        }
        return null;
    }

    public boolean deleteById(int id) {
        Article target = findById(id);
        if (target != null) {
            articles.remove(target);
            return true;
        }
        return false;
    }
}
