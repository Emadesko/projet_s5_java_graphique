package com.emadesko.controllers;

import org.mindrot.jbcrypt.BCrypt;

import com.emadesko.core.factory.services.CompteServiceFactory;
import com.emadesko.core.services.impl.YamlServiceImpl;
import com.emadesko.entities.Compte;
import com.emadesko.services.CompteService;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CompteController {

    private CompteService compteService;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    public void initialize() {
        this.compteService = CompteServiceFactory.getInstance(new YamlServiceImpl());
        // Configure le bouton pour capturer les événements de clic
        loginButton.setOnAction(event -> handleLogin());
    }

    private void handleLogin() {
        
        String login = loginField.getText();
        String password = passwordField.getText();
        Compte compte = compteService.getCompteByLogin(login);
        // Logique d'authentification (à remplacer par votre logique métier)
        if (compte!= null && BCrypt.checkpw(password, compte.getPassword())) {
            System.out.println("Connexion réussie !");
        } else {
            System.out.println("Login ou mot de passe incorrect.");
        }
    }
}
