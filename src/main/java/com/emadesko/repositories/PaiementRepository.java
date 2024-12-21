package com.emadesko.repositories;

import java.util.List;

import com.emadesko.core.repository.Repository;
import com.emadesko.entities.Dette;
import com.emadesko.entities.Paiement;


public interface PaiementRepository extends Repository<Paiement>{
    List <Paiement> getPaiementsByDette(Dette dette);
}
