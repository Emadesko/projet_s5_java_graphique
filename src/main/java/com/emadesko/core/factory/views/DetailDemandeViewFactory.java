package com.emadesko.core.factory.views;

import java.util.Scanner;

import com.emadesko.controllers.DetailDemandeView;
import com.emadesko.core.factory.services.DetailDemandeServiceFactory;
import com.emadesko.core.services.YamlService;

public abstract class DetailDemandeViewFactory {

    private static DetailDemandeView view;

    public static DetailDemandeView getInstance(Scanner scanner, YamlService yamlService) {
        if (view == null) {
            view = new DetailDemandeView(scanner,DetailDemandeServiceFactory.getInstance(yamlService));
        }
        return view;
    }

}
