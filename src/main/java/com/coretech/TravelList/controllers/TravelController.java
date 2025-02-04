package com.coretech.TravelList.controllers;

import com.coretech.TravelList.TravelListDTO.TrvListCustomDTO;
import com.coretech.TravelList.TravelListDTO.TrvListDTO;
import com.coretech.TravelList.entities.Travel;
import com.coretech.TravelList.servces.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/travel")
public class TravelController {

    @Autowired
    private TravelService travelService;

    @GetMapping(value = "/{id}")
    public TrvListDTO findAll(@PathVariable Long id){
        TrvListDTO result = travelService.finById(id);
        return result;
    }

    @GetMapping
    public List<TrvListCustomDTO> findAll(){
        List<TrvListCustomDTO> result = travelService.findAll();
        return result;
    }
}
