package com.emadesko.controllers;

import com.emadesko.entities.Detail;
import com.emadesko.services.DetailService;

import java.util.Scanner;


public class DetailView extends View<Detail>{

    private DetailService detailService;

    public DetailService getDetailService() {
        return detailService;
    }

    public DetailView(Scanner scanner, DetailService detailService) {
        super(scanner,detailService,"Aucun article", "Articles de la dette");
        this.detailService = detailService;
    }

}
