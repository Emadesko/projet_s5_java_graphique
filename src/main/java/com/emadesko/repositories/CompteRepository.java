package com.emadesko.repositories;

import java.util.List;


import com.emadesko.core.repository.Repository;
import com.emadesko.entities.Compte;
import com.emadesko.enums.Role;

public interface CompteRepository extends Repository<Compte>{
    Compte getCompteByLogin(String login);
    Compte getCompteByEmail(String email);
    List<Compte> getComptesByRole(Role role);
    List<Compte> getComptesByEtat(boolean isActive);
}
