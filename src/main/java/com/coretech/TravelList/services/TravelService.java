package com.coretech.TravelList.services;

import com.coretech.TravelList.TravelListDTO.TravelCustomDTO;
import com.coretech.TravelList.TravelListDTO.TravelDTO;
import com.coretech.TravelList.entities.Travel;
import com.coretech.TravelList.projections.TravelCustomProjection;
import com.coretech.TravelList.repositories.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TravelService {

    @Autowired
    TravelRepository travelRepository;

    @Transactional(readOnly = true)
    public TravelDTO finById(Long id) {
        Travel result = travelRepository.findById(id).get();
        return new TravelDTO(result);
        // Fazer tratamento de exceções
    }

    @Transactional(readOnly = true)
    public List<TravelCustomDTO> findAll() {
       List<Travel> result =  travelRepository.findAll();
       return result.stream().map(x -> new TravelCustomDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<TravelCustomDTO> findByList(Long listId) {
        List<TravelCustomProjection> result =  travelRepository.searchBy(listId);
        return result.stream().map(x -> new TravelCustomDTO(x)).toList();
    }
}
