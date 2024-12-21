package com.emadesko.repositories.jpa;

import com.emadesko.entities.Detail;
import com.emadesko.repositories.DetailRepository;

public class DetailRepositoryJpa extends DetailMereRepositoryJpa<Detail> implements DetailRepository{
    
    public DetailRepositoryJpa(){
        super(Detail.class,"dette_id");
    }
}
