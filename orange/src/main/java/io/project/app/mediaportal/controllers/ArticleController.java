package io.project.app.mediaportal.controllers;

import io.project.app.mediaportal.models.Article;
import io.project.app.mediaportal.services.ArticleService;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lilith
 */
@RestController
@RequestMapping("api/v2/articles")
@Slf4j
public class ArticleController{
        
    @Autowired
    private ArticleService articleService;


    @PostMapping(path = "/postArticle", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> postArticle(@RequestBody Article article){
        Optional<Article> postedArticle = articleService.create(article);
        return ResponseEntity.status(HttpStatus.OK).body(postedArticle.get());
    }
    
    
}
