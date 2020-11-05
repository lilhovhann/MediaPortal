package io.project.app.mediaportal.services;

import java.util.Optional;
import io.project.app.mediaportal.models.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.project.app.mediaportal.repositories.ArticleRepository;

/**
 *
 * @author lilith
 */
@Service
@Slf4j
public class ArticleService {
    
    @Autowired
    private ArticleRepository articeRepository;
    
    public Optional<Article> create(Article article){
        
        log.info("Article Service: creating article");
        final Article savedArticle = articeRepository.save(article);
        return Optional.ofNullable(savedArticle);
        
    }
}
