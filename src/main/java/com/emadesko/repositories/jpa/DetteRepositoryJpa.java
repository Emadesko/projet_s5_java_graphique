package com.emadesko.repositories.jpa;

import java.util.List;

import com.emadesko.entities.Client;
import com.emadesko.entities.Dette;
import com.emadesko.repositories.DetteRepository;

public class DetteRepositoryJpa extends DetteMereRepositoryJpa<Dette> implements DetteRepository{
    
    public DetteRepositoryJpa(){
        super(Dette.class);
    }

    @Override
    public List<Dette> getDettesNonSoldesByClient(Client client) {
        return em.createQuery("SELECT e FROM " + clazz.getSimpleName() + " e WHERE client_id = :id and isSolde = :isSolde", clazz)
            .setParameter("id", client.getId())    
            .setParameter("isSolde", false)    
            .getResultList();
    }

}
