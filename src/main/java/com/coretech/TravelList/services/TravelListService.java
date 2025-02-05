package com.coretech.TravelList.services;

import com.coretech.TravelList.TravelListDTO.TravelListDTO;
import com.coretech.TravelList.entities.TravelList;
import com.coretech.TravelList.repositories.TravelListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TravelListService {

    @Autowired
    TravelListRepository travelListRepository;

    @Transactional(readOnly = true)
    public List<TravelListDTO> findAll() {
        List<TravelList> result = travelListRepository.findAll();
        return result.stream().map(x -> new TravelListDTO(x)).toList();
    }

}
