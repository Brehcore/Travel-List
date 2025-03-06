package com.coretech.TravelList.controllers;

import com.coretech.TravelList.TravelListDTO.TravelCustomDTO;
import com.coretech.TravelList.TravelListDTO.TravelDTO;
import com.coretech.TravelList.services.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/travel")
public class TravelController {

    @Autowired
    private TravelService travelService;

    @GetMapping(value = "/{id}")
    public TravelDTO findAll(@PathVariable Long id){
        TravelDTO result = travelService.finById(id);
        return result;
    }

    @GetMapping
    public List<TravelCustomDTO> findAll(){
        List<TravelCustomDTO> result = travelService.findAll();
        return result;
    }
}
