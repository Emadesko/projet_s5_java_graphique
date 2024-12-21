package com.emadesko.core.factory.repository;

import com.emadesko.core.services.YamlService;
import com.emadesko.enums.RepositoryType;
import com.emadesko.repositories.PaiementRepository;
import com.emadesko.repositories.jpa.PaiementRepositoryJpa;

public abstract class PaiementRepositoryFactory {

    private static PaiementRepository repository;

    public static PaiementRepository getInstance(YamlService yamlService) {
        if (repository == null) {
            RepositoryType repositoryType = yamlService.getRepositoryType("paiement");
            switch (repositoryType) {
                case JPA:
                    repository = new PaiementRepositoryJpa();
                    break;

                default:
                    break;
            }
        }
        return repository;
    }

}
