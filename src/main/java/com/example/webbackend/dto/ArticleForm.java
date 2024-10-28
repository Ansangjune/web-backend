package com.example.webbackend.dto;

import com.example.webbackend.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    public String title;
    public String content;

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
