package com.emadesko.services;

import java.util.List;

import com.emadesko.entities.Dette;
import com.emadesko.entities.Detail;
import com.emadesko.repositories.DetailRepository;

public class DetailService extends DetailMereService<Detail>{
    
    private DetailRepository detailRepository;

    public DetailService(DetailRepository detailRepository) {
        super(detailRepository);
        this.detailRepository = detailRepository;
    }

    public List <Detail> getDetailsByDette(Dette dette){
        return this.detailRepository.getDetailMeresByDetteMere(dette);
    }
}
