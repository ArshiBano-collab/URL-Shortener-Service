package com.arshi.urlshortener.controller;

import com.arshi.urlshortener.service.UrlService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/shorten")
    public String shortenUrl(@RequestParam String url) {

        String shortCode = urlService.shortenUrl(url);

        return "Short URL: http://localhost:8080/api/r/" + shortCode;
    }

    @GetMapping("/r/{shortCode}")
    public void redirectUrl(@PathVariable String shortCode, HttpServletResponse response) throws IOException {

        String originalUrl = urlService.getOriginalUrl(shortCode);

        response.sendRedirect(originalUrl);
    }
}