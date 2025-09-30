package com.example.newsapi.dto;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Data;

@Data
public class NewsArticleResponse {
    private UUID id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime publicationDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
