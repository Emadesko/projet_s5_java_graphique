package com.emadesko.services;

import java.util.List;

import com.emadesko.entities.Article;
import com.emadesko.repositories.ArticleRepository;

public class ArticleService extends ServiceImpl<Article>{
    
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        super(articleRepository);
        this.articleRepository = articleRepository;
    }

    public Article getArticleByLibelle(String libelle){
        return this.articleRepository.getArticleByLibelle(libelle);
    }

    public List <Article> getUnavailableArticles(){
        return this.articleRepository.getUnavailableArticles();
    }

    public List <Article> getAvailableArticles(){
        return this.articleRepository.getAvailableArticles();
    }

}
