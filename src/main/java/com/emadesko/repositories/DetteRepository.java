package com.emadesko.repositories;

import java.util.List;

import com.emadesko.entities.Client;
import com.emadesko.entities.Dette;


public interface DetteRepository extends DetteMereRepository <Dette>{
    List<Dette> getDettesNonSoldesByClient(Client client);
}