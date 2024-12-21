package com.emadesko.core.factory.repository;

import com.emadesko.core.services.YamlService;
import com.emadesko.enums.RepositoryType;
import com.emadesko.repositories.DetailRepository;
import com.emadesko.repositories.jpa.DetailRepositoryJpa;

public abstract class DetailRepositoryFactory {

    private static DetailRepository repository;

    public static DetailRepository getInstance(YamlService yamlService) {
        if (repository == null) {
            RepositoryType repositoryType = yamlService.getRepositoryType("detail");
            switch (repositoryType) {
                case JPA:
                    repository = new DetailRepositoryJpa();
                    break;

                default:
                    break;
            }
        }
        return repository;
    }

}
