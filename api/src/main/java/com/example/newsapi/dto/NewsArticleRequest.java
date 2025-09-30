package com.example.newsapi.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NewsArticleRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String content;
    @NotBlank
    private String author;
}
