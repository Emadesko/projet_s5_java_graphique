package com.emadesko.core.factory.views;

import java.util.Scanner;

import com.emadesko.controllers.CompteView;
import com.emadesko.core.factory.services.CompteServiceFactory;
import com.emadesko.core.services.YamlService;

public abstract class CompteViewFactory {

    private static CompteView view;

    public static CompteView getInstance(Scanner scanner, YamlService yamlService) {
        if (view == null) {
            view = new CompteView(scanner,CompteServiceFactory.getInstance(yamlService));
        }
        return view;
    }

}
