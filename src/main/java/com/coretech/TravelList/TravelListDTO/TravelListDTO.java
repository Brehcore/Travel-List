package com.coretech.TravelList.TravelListDTO;

import com.coretech.TravelList.entities.TravelList;

public class TravelListDTO {

    private Long id;
    private String title;

    public TravelListDTO(){
    }

    public TravelListDTO(TravelList entity) {
        id = entity.getId();
        title = entity.getTitle();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
