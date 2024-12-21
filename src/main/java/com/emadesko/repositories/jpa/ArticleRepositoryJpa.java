package com.emadesko.repositories.jpa;

import java.util.List;

import com.emadesko.core.repository.impl.RepositoryJpa;
import com.emadesko.entities.Article;
import com.emadesko.repositories.ArticleRepository;

public class ArticleRepositoryJpa extends RepositoryJpa<Article> implements ArticleRepository{
    
    public ArticleRepositoryJpa(){
        super(Article.class);
    }

    @Override
    public Article getArticleByLibelle(String libelle) {
        return super.selectBy("libelle" + " LIKE :tel", "tel", libelle);
    }


    @Override
    public List<Article> getUnavailableArticles() {
        return em.createQuery("SELECT e FROM " + clazz.getSimpleName() + " e WHERE qteStock = 0", clazz).getResultList();
    }

    @Override
    public List<Article> getAvailableArticles() {
        return em.createQuery("SELECT e FROM " + clazz.getSimpleName() + " e WHERE qteStock > 0", clazz).getResultList();
    }
}
