package com.emadesko.repositories.jpa;

import java.util.List;

import com.emadesko.core.repository.impl.RepositoryJpa;
import com.emadesko.entities.Dette;
import com.emadesko.entities.Paiement;
import com.emadesko.repositories.PaiementRepository;

public class PaiementRepositoryJpa extends RepositoryJpa<Paiement> implements PaiementRepository{
    
    public PaiementRepositoryJpa(){
        super(Paiement.class);
    }

    @Override
    public List<Paiement> getPaiementsByDette(Dette dette) {
        return em.createQuery("SELECT e FROM " + clazz.getSimpleName() + " e WHERE dette_id = :id ", clazz)
            .setParameter("id", dette.getId())
            .getResultList();
        
    }
}
