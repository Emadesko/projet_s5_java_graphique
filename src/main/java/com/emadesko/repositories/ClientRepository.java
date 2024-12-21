package com.emadesko.repositories;

import java.util.List;

import com.emadesko.core.repository.Repository;
import com.emadesko.entities.Client;
import com.emadesko.entities.Compte;


public interface ClientRepository extends Repository<Client>{
    Client getClientByTelephone(String telephone);
    Client getClientBySurnom(String surnom);
    Client getClientByCompte(Compte compte);
    List <Client> getClientsByAccountStatus(boolean with);
}
