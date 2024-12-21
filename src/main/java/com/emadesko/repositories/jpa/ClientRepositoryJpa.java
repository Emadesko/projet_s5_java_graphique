package com.emadesko.repositories.jpa;

import java.util.List;

import com.emadesko.core.repository.impl.RepositoryJpa;
import com.emadesko.entities.Client;
import com.emadesko.entities.Compte;
import com.emadesko.repositories.ClientRepository;

public class ClientRepositoryJpa extends RepositoryJpa<Client> implements ClientRepository{
    
    public ClientRepositoryJpa(){
        super(Client.class);
    }

    @Override
    public Client getClientByTelephone(String telephone) {
        return super.selectBy("telephone LIKE :tel", "tel", telephone);
    }

    @Override
    public Client getClientBySurnom(String surnom) {
        return super.selectBy("surname LIKE :surnom", "surnom", surnom);
    }
    
    @Override
    public List<Client> getClientsByAccountStatus(boolean with) {
        String valeur= with ? "NOT " : "";
        return em.createQuery("SELECT e FROM " + clazz.getSimpleName() + " e WHERE compte_id IS " + valeur + "NULL", clazz).getResultList();
        
    }
    
    @Override
    public Client getClientByCompte(Compte compte) {
        return super.selectBy("compte_id = :surnom", "surnom", compte.getId());
    }
}
