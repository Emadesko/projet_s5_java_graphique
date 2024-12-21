package com.emadesko.core.factory.repository;

import com.emadesko.core.services.YamlService;
import com.emadesko.enums.RepositoryType;
import com.emadesko.repositories.DetteRepository;
import com.emadesko.repositories.jpa.DetteRepositoryJpa;

public abstract class DetteRepositoryFactory{

    private static DetteRepository repository;

    public static DetteRepository getInstance(YamlService yamlService) {
        if (repository==null) {
            RepositoryType repositoryType = yamlService.getRepositoryType("dette");
            switch (repositoryType) {
                case JPA:
                    repository = new DetteRepositoryJpa();
                    break;
                default:
                    break;
            }
        }
        return repository;
    }
    
}
