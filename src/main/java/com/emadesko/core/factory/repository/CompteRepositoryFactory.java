package com.emadesko.core.factory.repository;

import com.emadesko.core.services.YamlService;
import com.emadesko.enums.RepositoryType;
import com.emadesko.repositories.CompteRepository;
import com.emadesko.repositories.jpa.CompteRepositoryJpa;

public abstract class CompteRepositoryFactory {

    private static CompteRepository repository;

    public static CompteRepository getInstance(YamlService yamlService) {
        if (repository == null) {
            RepositoryType repositoryType = yamlService.getRepositoryType("compte");
            switch (repositoryType) {
                case JPA:
                    repository = new CompteRepositoryJpa();
                    break;

                default:
                    break;
            }
        }
        return repository;
    }

}
