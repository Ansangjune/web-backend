package com.example.webbackend.dto;

import com.example.webbackend.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    public String title;
    public String content;

    public Article toEntity() {
        return new Article(id, title, content);
    }
}
