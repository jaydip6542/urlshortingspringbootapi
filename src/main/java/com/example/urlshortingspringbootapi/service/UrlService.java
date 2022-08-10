package com.example.urlshortingspringbootapi.service;

import com.example.urlshortingspringbootapi.model.Url;
import com.example.urlshortingspringbootapi.model.UrlDto;
import org.springframework.stereotype.Service;

@Service
public interface UrlService {

    public Url generateShortLink(UrlDto urlDto);
    public Url persistShortLink(Url url);
    public Url getEncodedUrl(String url);
    public void deleteShortLink(Url url);
    public void openCountNumber(String shortLink);


}
