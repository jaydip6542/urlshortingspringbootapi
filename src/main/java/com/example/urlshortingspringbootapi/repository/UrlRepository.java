package com.example.urlshortingspringbootapi.repository;


import com.example.urlshortingspringbootapi.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url,Long>  {

    public Url findByShortLink(String shortLink);
    Url save(Url url);

    void delete(Url url);
}
