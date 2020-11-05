package io.project.app.mediaportal.repositories;

import io.project.app.mediaportal.models.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lilith
 */
@Repository
public interface ArticleRepository extends MongoRepository<Article, String>{
    
    @Override
    public void deleteById(String patientId);
}
