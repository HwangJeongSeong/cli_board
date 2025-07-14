package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

class Article {
    protected int id;
    protected String subject;
    protected String content;

    public Article(int id, String subject, String content) {
        this.id = id;
        this.subject = subject;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class getId extends getSubject {
    public getId() {
        super();
    }
}

class getSubject extends getContent {
    public getSubject() {
        super();
    }
}

class getContent {
    public getContent() {
    }
}
