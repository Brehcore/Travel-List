package com.coretech.TravelList.servces;

import com.coretech.TravelList.TravelListDTO.TrvListCustomDTO;
import com.coretech.TravelList.entities.Travel;
import com.coretech.TravelList.repositories.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {

    @Autowired
    TravelRepository travelRepository;

    public List<TrvListCustomDTO> findAll() {
       List<Travel> result =  travelRepository.findAll();
       return result.stream().map(TrvListCustomDTO::new).toList();
    }
}
