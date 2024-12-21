package com.emadesko.core.factory.views;

import java.util.Scanner;

import com.emadesko.controllers.DetailView;
import com.emadesko.core.factory.services.DetailServiceFactory;
import com.emadesko.core.services.YamlService;

public abstract class DetailViewFactory {

    private static DetailView view;

    public static DetailView getInstance(Scanner scanner, YamlService yamlService) {
        if (view == null) {
            view = new DetailView(scanner,DetailServiceFactory.getInstance(yamlService));
        }
        return view;
    }

}
