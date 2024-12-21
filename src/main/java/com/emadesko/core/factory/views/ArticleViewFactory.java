package com.emadesko.core.factory.views;

import java.util.Scanner;

import com.emadesko.controllers.ArticleView;
import com.emadesko.core.factory.services.ArticleServiceFactory;
import com.emadesko.core.services.YamlService;

public abstract class ArticleViewFactory {

    private static ArticleView view;

    public static ArticleView getInstance(Scanner scanner, YamlService yamlService) {
        if (view == null) {
            view = new ArticleView(scanner,ArticleServiceFactory.getInstance(yamlService));
        }
        return view;
    }

}
