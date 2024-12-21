package com.emadesko.services;

import java.util.List;

import com.emadesko.entities.Dette;
import com.emadesko.entities.Paiement;
import com.emadesko.repositories.PaiementRepository;

public class PaiementService extends ServiceImpl<Paiement>{
    
    private PaiementRepository paiementRepository;

    public PaiementService(PaiementRepository paiementRepository) {
        super(paiementRepository);
        this.paiementRepository = paiementRepository;
    }

    public List <Paiement> getPaiementsByDette(Dette dette){
        return this.paiementRepository.getPaiementsByDette(dette);
    }

}
