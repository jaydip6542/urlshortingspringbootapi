package com.example.urlshortingspringbootapi.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Url {

    @Id
    @SequenceGenerator(
            name = "url_sequence",
            sequenceName = "url_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "url_sequence")
    private Long id;

    private String originalUrl;
    private String shortLink;
    private LocalDateTime creationDate;
    private LocalDateTime expirationDate;

    private Integer count = 0;

    public Url() {
    }

    public Url(Long id, String originalUrl, String shortLink, LocalDateTime creationDate, LocalDateTime expirationDate, Integer count) {
        this.id = id;
        this.originalUrl = originalUrl;
        this.shortLink = shortLink;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
        this.count = count;
    }

    public Url(String originalUrl, String shortLink, LocalDateTime creationDate, LocalDateTime expirationDate, Integer count) {
        this.originalUrl = originalUrl;
        this.shortLink = shortLink;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Url{" +
                "id=" + id +
                ", originalUrl='" + originalUrl + '\'' +
                ", shortLink='" + shortLink + '\'' +
                ", creationDate=" + creationDate +
                ", expirationDate=" + expirationDate +
                ", count=" + count +
                '}';
    }
}
