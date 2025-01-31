package com.coretech.TravelList.servces;

import com.coretech.TravelList.TravelListDTO.TrvListCustomDTO;
import com.coretech.TravelList.TravelListDTO.TrvListDTO;
import com.coretech.TravelList.entities.Travel;
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
    public TrvListDTO finById(Long id) {
        Travel result = travelRepository.findById(id).get();
        return new TrvListDTO(result);
        // Fazer tratamento de exceções
    }

    @Transactional(readOnly = true)
    public List<TrvListCustomDTO> findAll() {
       List<Travel> result =  travelRepository.findAll();
       return result.stream().map(TrvListCustomDTO::new).toList();
    }
}
