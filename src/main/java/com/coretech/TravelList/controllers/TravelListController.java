package com.coretech.TravelList.controllers;

import com.coretech.TravelList.TravelListDTO.TravelListDTO;
import com.coretech.TravelList.services.TravelListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class TravelListController {

    @Autowired
    private TravelListService travelListService;

    @GetMapping
    public List<TravelListDTO> findAll(){
        List<TravelListDTO> result = travelListService.findAll();
        return result;
    }
}
